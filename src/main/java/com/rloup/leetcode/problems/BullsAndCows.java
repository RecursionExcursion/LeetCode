package com.rloup.leetcode.problems;

public class BullsAndCows {
    public String getHint(String secret, String guess) {

        int[] occurMap = new int[10];
        char[] secretChars = secret.toCharArray();
        char[] guessChars = guess.toCharArray();

        int bulls = 0;
        for (int i = 0; i < secretChars.length; i++) {
            occurMap[Character.getNumericValue(secretChars[i])]++;
            if (secretChars[i] == guessChars[i]) bulls++;
        }
        for (char c : guessChars) occurMap[Character.getNumericValue(c)]--;
        int cows = 0;
        for (int i : occurMap) if (i > 0) cows += i;
        cows = guessChars.length - bulls - cows;
        return String.format("%sA%sB", bulls, cows);
    }
}
