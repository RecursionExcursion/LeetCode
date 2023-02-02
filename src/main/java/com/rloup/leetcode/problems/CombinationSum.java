package com.rloup.leetcode.problems;

import java.util.*;

public class CombinationSum {
    public static void main(String[] args) {
        System.out.println(combinationSum(new int[]{2, 3, 5}, 8));
        System.out.println(combinationSum(new int[]{2, 3, 6, 7}, 7));
        System.out.println(combinationSum(new int[]{2}, 1));
        System.out.println(combinationSum(new int[]{2, 3, 4, 5}, 7));
        System.out.println(combinationSum(new int[]{2, 3, 5}, 6));
        System.out.println(combinationSum(new int[]{8, 7, 4, 3}, 11));

    }
    private static List<List<Integer>> combinationSum(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<List<Integer>> l = new ArrayList<>();

        for (int i = 0; i < candidates.length; i++) {
            List<Integer> intList = new ArrayList<>();
            intList.add(candidates[i]);
            int sum = getSumOfIntList(intList);
            if (sum >= target) {
                if (sum == target) {
                    l.add(intList);
                }
                break;
            }
            l.addAll(getValidNumberCombos(intList, i, candidates, target));
        }

        List<List<Integer>> returnList = new ArrayList<>();
        for (List<Integer> integerList : l) {
            Collections.sort(integerList);
            if(!returnList.contains(integerList)) returnList.add(integerList);
        }
        return returnList;
    }

    private static List<List<Integer>> getValidNumberCombos(
            List<Integer> numberCombos,
            int index,
            int[] candidates,
            int target) {

        List<List<Integer>> validCombo = new ArrayList<>();

        for (int j = index; j < candidates.length; j++) {
            List<Integer> ints = new ArrayList<>(numberCombos);
            ints.add(candidates[j]);
            int sum = getSumOfIntList(ints);
            if (sum <= target) validCombo.add(ints);
            if (sum >= target) break;
        }

        List<List<Integer>> intReturnList = new ArrayList<>();

        for (int i = 0; i < validCombo.size(); i++) {
            List<Integer> list = validCombo.get(i);
            if (getSumOfIntList(list) == target) {
                intReturnList.add(list);
                break;
            } else {
                intReturnList.addAll(getValidNumberCombos(list, i, candidates, target));
            }
        }
        return intReturnList;
    }

    private static int getSumOfIntList(List<Integer> integerList) {
        int sum = 0;
        for (int i : integerList) sum += i;
        return sum;
    }
}
