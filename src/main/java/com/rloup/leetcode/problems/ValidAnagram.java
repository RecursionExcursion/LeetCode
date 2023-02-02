package com.rloup.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class ValidAnagram {
    public static void main(String[] args) {

        String s1 = "rat";
        String s2 = "tar";

        System.out.println(isAnagram2(s1, s2));


    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        List<String> letters = new ArrayList<>(List.of(s.split("")));
        List<String> supposedAnagram = new ArrayList<>(List.of(t.split("")));

        for (String l : supposedAnagram) {
            if (!letters.contains(l)) {
                return false;
            } else {
                letters.remove(l);
            }
        }
        return true;
    }

    public static boolean isAnagram2(String s, String t) {
        int[] alph = new int[26];
        for (char sChar : s.toCharArray()) alph[sChar - 'a']++;
        for (char tChar : t.toCharArray()) alph[tChar - 'a']--;
        for (int i : alph) if (i != 0) return false;
        return true;
    }
}
