import java.util.ArrayDeque;
import java.util.Arrays;

public class DuplicateZeros {
    public static void main(String[] args) {
        int[] a = {1, 0, 2, 3, 0, 4, 5, 0};
        int[] b = {1, 2, 3};
        int[] c = {0, 2, 3};
        int[] d = {0, 2, 3, 0, 0};
        int[] e = {0, 0, 1, 0, 0, 4, 7, 8, 9};

        duplicatedZeros(a);
        duplicatedZeros(b);
        duplicatedZeros(c);
        duplicatedZeros(d);
        duplicatedZeros(e);

        System.out.println(Arrays.toString(Arrays.stream(a).toArray()));
        System.out.println(Arrays.toString(Arrays.stream(b).toArray()));
        System.out.println(Arrays.toString(Arrays.stream(c).toArray()));
        System.out.println(Arrays.toString(Arrays.stream(d).toArray()));
        System.out.println(Arrays.toString(Arrays.stream(e).toArray()));

    }

    private static void duplicatedZeros(int[] arr) {
        ArrayDeque<Integer> intDeque = new ArrayDeque<>();

        for (int i = 0; i < arr.length && intDeque.size() < arr.length; i++) {
            intDeque.add(arr[i]);
            if (arr[i] == 0) {
                intDeque.add(0);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = intDeque.pop();
        }
    }
}
