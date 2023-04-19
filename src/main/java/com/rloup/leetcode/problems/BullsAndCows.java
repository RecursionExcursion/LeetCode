package com.rloup.leetcode.problems;

public class BullsAndCows {
    public String getHint(String secret, String guess) {

        int[] occurMap = new int[10];
        char[] secretChars = secret.toCharArray();
        char[] guessChars = guess.toCharArray();

        int bulls = 0;
        for (int i = 0; i < secretChars.length; i++) {
            int numericValue = Character.getNumericValue(secretChars[i]);
            occurMap[numericValue]++;
            if (secretChars[i] == guessChars[i]) {
                bulls++;
            }
        }

        for (char c : guessChars) {
            int numericValue = Character.getNumericValue(c);
            if (occurMap[numericValue] > 0) {
                occurMap[numericValue]--;
            }
        }
        int notCows = 0;
        for (int i : occurMap) {
            notCows += i;
        }
        int cows = guessChars.length - bulls - notCows;

        return String.format("%sA%sB", bulls, cows);
    }
}
