package com.rloup.leetcode.problems;

public class FindWordsThatCanBeFormedByCharacters {

    public static void main(String[] args) {

        String[] words = {"cat", "bt", "hat", "tree"};
        String[] words2 = {"hello", "world", "leetcode", "tree"};


        System.out.println(countCharacters(words, "atach"));
        System.out.println(countCharacters(words2, "welldonehoneyr"));

    }

    public static int countCharacters(String[] words, String chars) {

        int length = 0;

        for (String word : words) {
            char[] tempCharArr = chars.toCharArray();
            char[] wordChars = word.toCharArray();
            boolean flag = false;
            for (char c : wordChars) {
                flag = false;
                for (int i = 0; i < tempCharArr.length; i++) {
                    if (tempCharArr[i] != 0 && c == tempCharArr[i]) {
                        tempCharArr[i] = 0;
                        flag = true;
                        break;
                    }
                }
                if (!flag) break;
            }
            if (flag) length += word.length();
        }
        return length;
    }

//    public static int countCharacters(String[] words, String chars) {
//
//        int length = 0;
//
//        List<Character> charList = new java.com.rloup.leetcode.util.ArrayList<>(IntStream.range(0, chars.length())
//                                                                      .mapToObj(chars::charAt)
//                                                                      .toList());
//
//        for (String word : words) {
//
//            List<Character> tempList = new ArrayList<>(charList);
//            boolean flag = true;
//            char[] wordChars = word.toCharArray();
//
//            for (char c : wordChars) {
//                boolean isPresent = tempList.remove(Character.valueOf(c));
//                if (!isPresent) {
//                    flag = false;
//                    break;
//                }
//            }
//            if (flag) length += word.length();
//        }
//
//        return length;
//    }
}
