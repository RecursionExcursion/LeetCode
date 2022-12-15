public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
        System.out.println(fib(0));
        System.out.println(fib(1));
    }

    private static int fib(int n) {
        if (n == 0) return 0;
        int n1 = 0, n2 = 1;
        for (int i = 1; i < n; i++) {
            int nTmp = n1 + n2;
            n1 = n2;
            n2 = nTmp;
        }
        return n2;
    }
}
