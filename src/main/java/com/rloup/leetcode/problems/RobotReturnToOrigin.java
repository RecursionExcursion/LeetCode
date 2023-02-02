package com.rloup.leetcode.problems;

public class RobotReturnToOrigin {
    public static void main(String[] args) {

        System.out.println(judgeCircle("UD"));
        System.out.println(judgeCircle("LL"));

    }


    private static boolean judgeCircle(String moves) {

        int xAxis = 0;
        int yAxis = 0;

        char[] movements = moves.toCharArray();

        for (char c : movements) {
            switch (c) {
                case 85 -> yAxis++;
                case 68 -> yAxis--;
                case 82 -> xAxis++;
                case 76 -> xAxis--;
            }
        }

        return xAxis == 0 && yAxis == 0;

    }
}
