package com.rloup.leetcode.problems;

public class CheckIfTheSentenceIsPangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        String sentence2 = "leetcode";

        System.out.println(checkIfPangram(sentence));
        System.out.println(checkIfPangram(sentence2));
    }

    public static boolean checkIfPangram(String sentence) {

        boolean[] usedLetters = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            usedLetters[sentence.charAt(i) - 97] = true;
        }
        for (boolean b : usedLetters) if(!b) return false;
        return true;
    }
}
