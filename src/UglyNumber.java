public class UglyNumber {
    public static void main(String[] args) {
        int x = 8;
        int y = 14;
        int z = 0;
        int a = 15;


        System.out.println(isUgly(x));
        System.out.println(isUgly(y));
        System.out.println(isUgly(z));
        System.out.println(isUgly(a));
    }

    public static boolean isUgly(int n) {
        if (n == 0) return false;
        if (n == 1) return true;
        for (int i = 2; i <= 5; i++)
            while (n % i == 0) n /= i;
        return n == 1;
    }
}
