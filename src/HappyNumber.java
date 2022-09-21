import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));

    }

//    public static boolean isHappy(int n) {
//        int loop = 0;
//
//        return isHappy(n, loop);
//    }
//
//    public static boolean isHappy(int n, int loop) {
//        loop++;
//        if (loop == 1000) {
//            return false;
//        }
//
//        String[] digits = String.valueOf(n).split("");
//        int x = Arrays.stream(digits)
//                      .map(Integer::parseInt)
//                      .map(i -> i * i)
//                      .reduce(0, Integer::sum);
//
//        if (x == 1) {
//            return true;
//        } else {
//            return isHappy(x, loop);
//        }
//    }

    public static boolean isHappy(int n) {
        Set<Integer> intSet = new HashSet<>();

        return isHappy(n, intSet);
    }

    public static boolean isHappy(int n, Set<Integer> intSet) {

        String[] digits = String.valueOf(n).split("");
        int x = Arrays.stream(digits)
                      .map(Integer::parseInt)
                      .map(i -> i * i)
                      .reduce(0, Integer::sum);

        if (x == 1) {
            return true;
        } else if(intSet.contains(x)){
            return false;
        }
        else {
            intSet.add(x);
            return isHappy(x, intSet);
        }
    }
}

