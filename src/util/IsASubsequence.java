package util;

import java.util.ArrayDeque;

public class IsASubsequence {
    public static void main(String[] args) {

        System.out.println(isSubsequence("abc", "ahbgdc"));
        System.out.println(isSubsequence("axc", "ahbgdc"));
        System.out.println(isSubsequence("ab", "baab"));

    }

    public static boolean isSubsequence(String s, String t) {

        ArrayDeque<Character> intDq = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            intDq.add(c);
        }

        for (char c : t.toCharArray()) {
            if (intDq.contains(c)) {
                if(intDq.peek() == c){
                    intDq.pop();
                }
            }
        }
        return intDq.isEmpty();
    }
}
