package com.rloup.leetcode.problems;

import java.util.*;

public class RepeatedDNASequences {
    public static void main(String[] args) {

        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        String s2 = "AAAAAAAAAAAAA";


        System.out.println(findRepeatedDNASequences(s));
        System.out.println(findRepeatedDNASequences(s2));

    }

    public static List<String> findRepeatedDNASequences(String dna) {
        //Returning 10 letter long sequences
        List<String> sequences = new ArrayList<>();
        String dnaCopy = dna;
        String substring;

        while (dnaCopy.length() > 10) {
            substring = dnaCopy.substring(0, 10);
            dnaCopy = dnaCopy.substring(1);
            if (!sequences.contains(substring)) {
                if (dnaCopy.contains(substring)) {
                    sequences.add(substring);
                }
            }
        }
        return sequences;
    }


    public static List<String> findRepeatedDnaSequences(String dna) {
        if (dna.length() < 10) return new ArrayList<>();
        Set<String> sequences = new HashSet<>();

        String[] dnaArr = dna.split("");

        for (int i = 0, j = 9; j < dna.length(); i++, j++) {
            String tempSequence = dna.substring(i, j + 1);
            if (sequences.contains(tempSequence)) {
                continue;
            }

            for (int a = i + 1, b = j + 1; b < dnaArr.length; a++, b++) {
                String tempsubstring = dna.substring(a, b + 1);
                if (tempsubstring.equals(tempSequence)) {
                    sequences.add(tempSequence);
                    break;
                }
            }
        }
        return new ArrayList<>(sequences);
    }
}
