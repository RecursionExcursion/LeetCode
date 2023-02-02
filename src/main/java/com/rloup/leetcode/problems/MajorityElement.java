package com.rloup.leetcode.problems;

import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {

        int[] nums = {3, 2, 3};

        System.out.println(majorityElementFaster(nums));

    }


    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        Arrays.stream(nums).forEach(i -> {
            if (freqMap.containsKey(i)) {
                int tempI = freqMap.get(i);
                freqMap.put(i, ++tempI);
            } else {
                freqMap.putIfAbsent(i, 1);
            }
        });

        int mostFreqKey = -1;

        for (int key : freqMap.keySet()) {
            if (mostFreqKey == -1) {
                mostFreqKey = key;
            } else {
                if (freqMap.get(key) > freqMap.get(mostFreqKey)) {
                    mostFreqKey = key;
                }
            }
        }

        return mostFreqKey;
    }

    public static int majorityElementFaster(int[] nums) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : nums) {
            if (freqMap.containsKey(num)) {
                int tempI = freqMap.get(num);
                freqMap.put(num, ++tempI);
            } else {
                freqMap.putIfAbsent(num, 1);
            }
        }

        int mostFreqKey = -1;

        for (int key : freqMap.keySet()) {
            if (mostFreqKey == -1) {
                mostFreqKey = key;
            } else {
                mostFreqKey = freqMap.get(key) > freqMap.get(mostFreqKey) ? key : mostFreqKey;
            }
        }

        return mostFreqKey;
    }
}
