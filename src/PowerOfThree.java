public class PowerOfThree {
    public static void main(String[] args) {
        int i = 9;
        int i2 = 27;
        int i3 = 2147483647;

        System.out.println(1 % 3);
        System.out.println(isPowerOfThree(i));
        System.out.println(isPowerOfThree(i2));
        System.out.println(isPowerOfThree(i3));

    }

    private static boolean isPowerOfThree(int n) {
        long ans = -1;
        for (int i = 0; ans < n; i++) ans = (long) Math.pow(3, i);
        return ans > 0 && ans == n;
    }

    private static boolean isPowerOfThree2(int n) {
        long ans = 0;
        int i = 0;
        while (ans < n) {
            ans = (long) Math.pow(3, i++);
            if (n == ans) return true;
        }
        return false;
    }

    private static boolean isPowerOfThree4(int n) {
        return (n > 0 && 1162261467 % n == 0);
    }
}
