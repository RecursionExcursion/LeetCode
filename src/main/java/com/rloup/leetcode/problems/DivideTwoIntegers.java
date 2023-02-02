package com.rloup.leetcode.problems;

public class DivideTwoIntegers {
    public static void main(String[] args) {
        System.out.println(divide(1000, 3));
        System.out.println(divide(7, -3));
        System.out.println(divide(7, 3));
        System.out.println(divide(-1, 1));
        System.out.println(divide(1, 1));
        System.out.println(divide(-2147483648, -1));
        System.out.println(divide(-2147483648, 2));
        System.out.println(divide(-2147483648, -3));
    }

    public static int divide(int dividend, int divisor) {


        long ans = 0;
        //Check if ans will be neg
        boolean negFlag = (dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0);
        //Convert to positive
        long dividendVar = Math.abs((long) dividend);
        long divisorVar = Math.abs((long) divisor);
        long tempDivisVar = Math.abs((long) divisor);

        //Edge Cases
        if (divisorVar > dividendVar) return 0;
        else if (divisorVar == 1) ans = dividendVar;
        else if (divisorVar == dividendVar) ans = 1;
            //Division
        else {
            long x = 1;
            long y = 0;
            for (int i = 2; Math.pow(divisorVar, i) < dividendVar; i++) {
                y++;
            }
            if (y > 0) {
                x = (long) Math.pow(divisorVar, y - 1);
                long tempX = x;

                long z = (long) Math.pow(divisorVar, y);
                long tempZ = z;

                while (tempZ + z < dividendVar) {
                    tempZ += z;
                    tempX += x;
                }

                divisorVar = tempZ;

                x = tempX;
            }

            while (dividendVar > divisorVar) {
                divisorVar += Math.abs(divisor);
                if (dividendVar > divisorVar) x++;
            }
            ans = x;
        }

        //taking care of negative
        ans = Math.abs(ans);
        if (negFlag) ans = Math.negateExact(ans);

        //Converting to and returning int
        ans = Math.min(ans, Integer.MAX_VALUE);
        ans = Math.max(ans, Integer.MIN_VALUE);
        return (int) ans;
    }
}
