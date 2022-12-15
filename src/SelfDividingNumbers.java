import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(1, 22));
        System.out.println(selfDividingNumbers(47, 85));
    }

    //    private static List<Integer> selfDividingNumbers(int left, int right) {
//
//        List<Integer> integerList = new ArrayList<>();
//
//        for (int i = left; i <= right; i++) {
//            if (i < 10) {
//                integerList.add(i);
//                continue;
//            }
//            boolean isSelfDividing = true;
//
//            if (i % 10 == 0) continue;
//
//            int n = i;
//            while (n > 10) {
//                double x = n / 10.0;
//                int y = (int) Math.round((x - (int) x) * 10);
//                if (y == 0 || i % y != 0) {
//                    isSelfDividing = false;
//                    break;
//                }
//                n = (int) x;
//            }
//
//            if (i % n != 0) continue;
//            if (isSelfDividing) integerList.add(i);
//
//
//        }
//
//        return integerList;
//    }
    private static List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> integerList = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            if (i >= 10) {
                if (i % 10 == 0) continue;
                boolean isSelfDividing = true;
                int n = i;
                while (n > 10) {
                    double x = n / 10.0;
                    int y = (int) Math.round((x - (int) x) * 10);
                    if (y == 0 || i % y != 0) {
                        isSelfDividing = false;
                        break;
                    }
                    n = (int) x;
                }
                if (i % n != 0 || !isSelfDividing) continue;
            }
            integerList.add(i);

        }

        return integerList;
    }
}
