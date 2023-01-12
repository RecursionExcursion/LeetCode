import java.util.ArrayDeque;
import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};

        rotate(matrix);
        rotate(matrix2);
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(Arrays.deepToString(matrix2));
    }

//    public static void rotate(int[][] matrix) {
//
//        int sizeOfSide = matrix.length;
//
//        ArrayDeque<Integer> top = new ArrayDeque<>(sizeOfSide);
//        ArrayDeque<Integer> right = new ArrayDeque<>(sizeOfSide);
//        ArrayDeque<Integer> bottom = new ArrayDeque<>(sizeOfSide);
//        ArrayDeque<Integer> left = new ArrayDeque<>(sizeOfSide);
//
//
//        for (int i = 0; i < sizeOfSide; i++) {
//            for (int j = 0; j < sizeOfSide; j++) {
//                if (i == 0) {
//                    top.add(matrix[i][j]);
//                }
//                if (i == sizeOfSide - 1) {
//                    bottom.push(matrix[i][j]);
//                }
//                if (j == 0) {
//                    left.push(matrix[i][j]);
//                }
//                if (j == sizeOfSide - 1) {
//                    right.add(matrix[i][j]);
//                }
//            }
//        }
//
//        int r = 0, c = 0;
//        //Left to top
//        while (c < sizeOfSide) {
//            matrix[0][c++] = left.pop();
//        }
//
//        //top to right
//        while (r < sizeOfSide) {
//            matrix[r++][sizeOfSide - 1] = top.pop();
//        }
//
//        --c;
//        //right to bottom
//        while (c >= 0) {
//            matrix[sizeOfSide - 1][c--] = right.pop();
//        }
//
//        --r;
//        //bottom to left
//        while (r >= 0) {
//            matrix[r--][0] = bottom.pop();
//        }
//
//
//    }

    public static void rotate(int[][] matrix) {

        int sizeOfSide = matrix.length;

        ArrayDeque<Integer> columnDQ = new ArrayDeque<>();


        for (int i = 0; i < sizeOfSide; i++) {
            for (int j = 0; j < sizeOfSide; j++) {
                columnDQ.push(matrix[j][i]);
            }
        }


        for (int i = sizeOfSide-1; i >= 0; i--) {
            for (int j = 0; j < sizeOfSide; j++) {
                matrix[i][j] = columnDQ.pop();
            }
        }
    }
}
