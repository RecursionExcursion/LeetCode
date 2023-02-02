package com.rloup.leetcode.problems;

public class ComplementOfBase10Int {

    public static void main(String[] args) {
        System.out.println(bitwiseComplement(5));
        System.out.println(bitwiseComplement(7));
        System.out.println(bitwiseComplement(10));

    }

    public static int bitwiseComplement(int n) {
        char[] binaryValue = Integer.toBinaryString(n).toCharArray();

        for (int i = 0; i < binaryValue.length; i++){
            binaryValue[i] = (binaryValue[i] == '0' ? '1' : '0');
        }

      return Integer.parseInt(String.valueOf(binaryValue),2);



    }
}
