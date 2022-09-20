import java.util.Arrays;

public class HappyNumber {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(isHappy(n));

    }

    public static boolean isHappy(int n) {
        int loop = 0;

        return isHappy(n, loop);
    }

    public static boolean isHappy(int n, int loop) {
        loop++;
        if (loop == 1000) {
            return false;
        }

        String[] digits = String.valueOf(n).split("");
        int x = Arrays.stream(digits)
                      .map(Integer::parseInt)
                      .map(i -> i * i)
                      .reduce(0, Integer::sum);

        if (x == 1) {
            return true;
        } else {
            return isHappy(x, loop);
        }
    }
}

