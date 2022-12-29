import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int[] h1 = {1, 1, 4, 2, 1, 3};
        int[] h2 = {5, 1, 2, 3, 4};
        int[] h3 = {1, 2, 3, 4, 5};

        System.out.println(heightChecker(h1));
        System.out.println(heightChecker(h2));
        System.out.println(heightChecker(h3));

    }

    private static int heightChecker(int[] heights) {
        int[] expected = Arrays.copyOf(heights, heights.length);
        Arrays.sort(expected);
        int ans = 0;
        for (int i = 0; i < expected.length; i++) {
            if (expected[i] != heights[i]) ans++;
        }
        return ans;
    }
}
