package com.rloup.leetcode.problems;

public class CheckDistanceBetweenSameLetters {
    public boolean checkDistances(String s, int[] distance) {

        char[] chars = s.toCharArray();

        for (int i = 0; i < distance.length; i++) {
            int reqSpaces = distance[i];
            char c = (char) (i + 97);
            if (s.contains(Character.toString(c))) {
                int spaces = 0;
                boolean hasOccurred = false;
                for (char letter : chars) {
                    if (letter == c) {
                        if (!hasOccurred) {
                            hasOccurred = true;
                        } else {
                            if (spaces != reqSpaces) {
                                return false;
                            } else {
                                break;
                            }
                        }
                    } else if (hasOccurred) {
                        spaces++;
                    }
                }
            }
        }
        return true;
    }
}
