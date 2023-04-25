package com.rloup.leetcode.problems;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class DifferentWaysToAddParentheses {

    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> ans = new ArrayList<>();
        if (stringIsValidNum(expression)) {
            if (expression.length() >= 1) {
                ans.add(Integer.parseInt(expression));
            } else {
                ans.add(0);
            }
            return ans;
        }
        List<String> equations = prodEquation(expression);
        for (int i = 0; i < equations.size(); i++) {
            String equation = equations.get(i);
            int solved = solve(equation, i);
            ans.add(solved);
        }
        return ans;
    }

    private List<String> prodEquation(String s) {

        List<String> nums = getNums(s);
        List<String> ops = getOps(s);

        List<List<String>> lists = new ArrayList<>();

        for (int i = 0; i < nums.size() - 1; i++) {
            List<String> mid = buildEquationWithPars(new ArrayList<>(nums), new ArrayList<>(ops), i, i + 1, i);
            lists.add(mid);
        }

        List<String> first = lists.get(0);
        List<String> last = lists.get(lists.size() - 1);

        for (int i = 1; i < first.size(); i++) {
            String str = first.get(i);
            if (last.contains(str)) {
                last.remove(str);
            } else {
                first.remove(i);
            }
        }
        last = List.of(last.get(0));

        lists.set(0, first);
        lists.set(lists.size() - 1, last);

        List<String> foo = new ArrayList<>();

        for (List<String> list : lists) {
            foo.addAll(list);
        }
        return foo.stream().map(p -> p.replaceAll("\\(\\d+\\)", "X"))
                  .filter(p -> !p.contains("X"))
                  .distinct()
                  .toList();
    }

    private List<String> buildEquationWithPars(List<String> nums, List<String> ops, int x, int y, int z) {
        String run = "(" + nums.get(x) + ops.get(z) + nums.get(y) + ")";
        List<String> equations = produceEquations(nums, ops, run, x, y);
        return new ArrayList<>(equations);
    }

    private List<String> produceEquations(List<String> nums,
                                          List<String> ops,
                                          String running,
                                          int x,
                                          int y) {

        if (x <= 0 && y >= nums.size() - 1) {
            running = fixPars(running);
            return List.of(running);
        }

        final int finalX = x;
        final int finalY = y;

        List<String> list = new ArrayList<>();

        //Left
        if (x > 0) {
            x--;
            String runLeftClosed = "(" + nums.get(x) + ops.get(x) + running + ")";
            list.addAll(produceEquations(nums, ops, runLeftClosed, x, finalY));

            if (x > 0) {
                String runLeftOpen = nums.get(x) + ")" + ops.get(x) + running;
                list.addAll(produceEquations(nums, ops, runLeftOpen, x, finalY));
            }
        }

        //Right
        if (y < nums.size() - 1) {
            int opIndex = ++y > ops.size() ? y - (ops.size()) : y - 1;
            String runRightClosed = "(" + running + ops.get(opIndex) + nums.get(y) + ")";
            list.addAll(produceEquations(nums, ops, runRightClosed, finalX, y));

            if (y < nums.size() - 1) {
                String runRightOpen = running + ops.get(opIndex) + "(" + nums.get(y);
                list.addAll(produceEquations(nums, ops, runRightOpen, finalX, y));
            }
        }

        return list;
    }

    private static String fixPars(String running) {
        int open = 0;
        int closed = 0;
        char[] chars = running.toCharArray();
        for (char c : chars) {
            if (c == '(') open++;
            else if (c == ')') closed++;
        }

        if (open != closed) {

            int diff = Math.abs(open - closed);
            StringBuilder runningBuilder = new StringBuilder(running);
            for (int j = 0; j < diff; j++) {
                if (closed < open) {
                    runningBuilder.append(")");
                } else {
                    runningBuilder.insert(0, "(");
                }
            }
            running = runningBuilder.toString();
        }
        return running;
    }

    private boolean stringIsValidNum(String s) {
        return s.matches("^-?\\d+$");
    }

    private int solve(String equation, int index) {
        String e = equation;
        while (!stringIsValidNum(e)) {
            e = simplify(e);
        }
        return Integer.parseInt(e);
    }

    private String simplify(String s) {

        int lastOpen = -1;
        int firstClose = -1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') lastOpen = i;
            else if (ch == ')') {
                firstClose = i;
                break;
            }
        }
        if (firstClose == -1) {
            int i = solveSimpleExpression(s);
            return String.valueOf(i);
        }

        String substring = s.substring(lastOpen + 1, firstClose);
        int i = solveSimpleExpression(substring);
        String front = "";
        if (lastOpen != -1) {
            front = s.substring(0, lastOpen);
        }
        String end = s.substring(firstClose + 1);
        String simp = front + i + end;
        simp = fixPars(simp);
        return simp;
    }

    private int solveSimpleExpression(String exp) {

        List<String> nums = filterViaSplit(exp, "[+|*|-]");
        List<String> ops = new ArrayList<>();

        for (int i = 0; i < nums.size(); i++) {
            String num = nums.get(i);
            num = num.replaceAll("\\)", "");
            num = num.replaceAll("\\(", "");
            nums.set(i, num);
        }

        List<String> tempOps = filterViaSplit(exp, "[\\d]");

        for (int i = 0; i < tempOps.size(); i++) {
            String op = tempOps.get(i);
            if (op.length() > 1) {
                if (op.equals("+-")) {
                    ops.add("-");
                } else if (op.equals("--")) {
                    ops.add("+");
                } else {
                    String[] split = op.split("");
                    nums.set(i, split[1] + nums.get(i));
                    ops.add(split[0]);
                }
            } else {
                ops.add(op);
            }
        }

        while (nums.size() <= ops.size()) {
            for (int j = 0; j < nums.size(); j++) {
                String s = nums.get(j);
                int i = exp.indexOf(s);
                if (i % 2 != 0) {
                    nums.set(j, "-" + nums.get(j));
                    ops.remove(j);
                    break;
                }
            }
        }


        BiFunction<String, String, Integer> mult = (s1, s2) -> Integer.parseInt(s1) * Integer.parseInt(s2);
        BiFunction<String, String, Integer> add = (s1, s2) -> Integer.parseInt(s1) + Integer.parseInt(s2);
        BiFunction<String, String, Integer> sub = (s1, s2) -> Integer.parseInt(s1) - Integer.parseInt(s2);

        BiConsumer<Integer, Integer> adjustList = (i, x) -> {
            nums.set(i, String.valueOf(x));
            nums.remove(i + 1);
            ops.remove(ops.get(i));
        };

        while (ops.contains("*")) {
            int i = ops.indexOf("*");
            int x = mult.apply(nums.get(i), nums.get(i + 1));
            adjustList.accept(i, x);
        }

        while (!ops.isEmpty()) {
            String s = ops.get(0);
            int x = s.equals("+") ? add.apply(nums.get(0), nums.get(1)) : sub.apply(nums.get(0), nums.get(1));
            adjustList.accept(0, x);
        }
        return Integer.parseInt(nums.get(0));
    }

    private List<String> getOps(String s) {
        return filterViaSplit(s, "\\d");
    }

    private List<String> getNums(String s) {
        return filterViaSplit(s, "\\D");
    }

    private List<String> filterViaSplit(String s, String regEx) {
        return Arrays.stream(s.split(regEx))
                     .filter(str -> !str.isEmpty())
                     .collect(Collectors.toCollection(ArrayList::new));
    }

    public List<Integer> diffWaysToCompute2(String input) {
        List<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '-' || c == '+' || c == '*') {
                String a = input.substring(0, i);
                String b = input.substring(i + 1);
                List<Integer> al = diffWaysToCompute(a);
                List<Integer> bl = diffWaysToCompute(b);
                for (int x : al) {
                    for (int y : bl) {
                        if (c == '-') {
                            res.add(x - y);
                        } else if (c == '+') {
                            res.add(x + y);
                        } else if (c == '*') {
                            res.add(x * y);
                        }
                    }
                }
            }
        }
        if (res.size() == 0) res.add(Integer.valueOf(input));
        return res;
    }
}


