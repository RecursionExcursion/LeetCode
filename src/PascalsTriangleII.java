import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
    public static void main(String[] args) {
        int rowIndex = 0;

        System.out.println(getRow(rowIndex));
    }


    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> pascalsTriangleList = new ArrayList<>();

        //Create list structure
        for (int i = 0; i < rowIndex + 1; i++) {

            List<Integer> newIntList = new ArrayList<>();

            if (i == 0) {
                newIntList.add(1);
            } else {

                for (int j = 0; j <= i; j++) {
                    if (j == 0) {
                        newIntList.add(pascalsTriangleList.get(i - 1).get(i - 1));
                    } else if (j == i) {
                        newIntList.add(pascalsTriangleList.get(i - 1).get(
                                pascalsTriangleList.get(i - 1).size() - 1));
                    } else {
                        newIntList.add(pascalsTriangleList.get(i - 1).get(j - 1) +
                                               pascalsTriangleList.get(i - 1).get(j));
                    }
                }
            }
            pascalsTriangleList.add(newIntList);
        }
        //populate list structure
        return pascalsTriangleList.get(rowIndex);
    }
}
