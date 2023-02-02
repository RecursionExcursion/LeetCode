package com.rloup.leetcode.problems;

import java.util.Arrays;
import java.util.List;

public class FirstUniqueChar {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
        System.out.println(firstUniqChar("loveleetcode"));
        System.out.println(firstUniqChar("aabb"));
        System.out.println(firstUniqChar("aaabb"));
        System.out.println(firstUniqChar("afafeabb"));
    }

    private static int firstUniqChar(String s) {

        List<String> strings = Arrays.stream(s.split("")).distinct().toList();
        return s.indexOf(strings.get(0));

    }

//    private static int firstUniqChar(String s) {
//        List<String> characterList = new ArrayList<>();
//        List<String> usedChars = new ArrayList<>();
//
//        for (String l : s.split("")) {
//            if (usedChars.contains(l)) {
//                characterList.remove(l);
//            } else {
//                characterList.add(l);
//                usedChars.add(l);
//            }
//        }
//        return characterList.size() == 0 ? -1 : List.of(s.split("")).indexOf(characterList.get(0));
//    }
}
