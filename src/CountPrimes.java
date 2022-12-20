import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountPrimes {
    public static void main(String[] args) {

        System.out.println(countPrimes(10));
        System.out.println(countPrimes(9));
        System.out.println(countPrimes(5));
        System.out.println(countPrimes(1));
        System.out.println(countPrimes(0));
        System.out.println(countPrimes(2));
        System.out.println(countPrimes(20));
        System.out.println(countPrimes(40));
        System.out.println(countPrimes(499979));
        System.out.println();
        System.out.println(countPrimes(10));
        System.out.println(countPrimes(20));
        System.out.println(countPrimes(30));
        System.out.println(countPrimes(40));
        System.out.println(countPrimes(50));
        System.out.println(countPrimes(60));
        System.out.println(countPrimes(70));
        System.out.println(countPrimes(80));
        System.out.println(countPrimes(90));
        System.out.println(countPrimes(100));
        System.out.println();
        System.out.println(countPrimes(2));
        System.out.println(countPrimes(3));

    }

    private static int countPrimes(int n) {

        if (n < 3) return 0;

        boolean[] isNotPrime = new boolean[n];

        for (int i = 2; i < n - 1; i++) {
            if (!isNotPrime[i]) {
                int x = i;
                while (x < n) {
                    x += i;
                    if (x < n && !isNotPrime[x]) isNotPrime[x] = true;
                }
            }
        }

        int c = 0;
        for (boolean b : isNotPrime) if (!b) c++;
        return c-2;
    }

    private static int countPrimes4(int n) {

        if (n < 3) return 0;

        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, 2, n, true);

        for (int i = 2; i < n - 1; i++) {
            if (isPrime[i]) {
                int x = i;
                while (x < n) {
                    x += i;
                    if (x < n && isPrime[x]) isPrime[x] = false;
                }
            }
        }
        int c = 0;
        for (boolean b : isPrime) if (b) c++;
        return c;
    }

    private static int countPrimes3(int n) {


        int num = n % 2 == 0 ? n - 1 : n - 2;

        List<Integer> primes = new ArrayList<>();
        if (n > 2) primes.add(2);
        if (n > 3) primes.add(3);

        for (int i = 5; i <= num; i += 2) {
            boolean isPrimeTime = true;
            for (int prime : primes) {
                if (i % prime == 0) {
                    isPrimeTime = false;
                    break;
                }
            }

            if (isPrimeTime) primes.add(i);
        }


        return primes.size();

    }

    private static int countPrimes2(int n) {

        int count = 0;

        int num = n % 2 == 0 ? n - 1 : n - 2;

        for (int i = 3; i <= num; i += 2) {
            boolean isPrimeTime = true;
            for (int j = 2; j <= (i / 2); j++) {
                if (i % j == 0) {
                    isPrimeTime = false;
                    break;
                }
            }
            if (isPrimeTime) count++;
        }
        if (n > 2) count++;


        return count;

    }

    private static int countPrimes1(int n) {

        int count = 0;

        int num = n % 2 == 0 ? n - 1 : n - 2;

        for (int i = num; i > 1; i -= 2) {
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) break;
                if (j == i / 2) count++;
            }
        }


        if (n > 2) {
            count++;
            if (n > 3) {
                count++;
            }
        }

        return count;

    }
}
