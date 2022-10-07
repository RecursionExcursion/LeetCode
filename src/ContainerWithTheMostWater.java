public class ContainerWithTheMostWater {
    public static void main(String[] args) {
        int[] h = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] h2 = {1, 2, 1};

        System.out.println(maxArea2(h2));
    }

    public static int maxArea(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = height.length - 1; j > i; j--) {
                maxArea = Math.max(maxArea,
                                   (Math.min(height[i], height[j])) * (j - i));
            }
        }
        return maxArea;
    }

    public static int maxArea2(int[] height) {

        int tallest = 0, tallestIndex = -1;
        int secondTallest = 0, secondTallestIndex = -1;

        for (int i = 0; i < height.length; i++) {
            if (tallest < height[i]) {
                secondTallest = tallest;
                secondTallestIndex = tallestIndex;
                tallest = height[i];
                tallestIndex = i;
            } else if (i != tallestIndex && secondTallest < height[i]) {
                secondTallest = height[i];
                secondTallestIndex = i;
            }
        }
        if (tallest == 0 || secondTallest == 0) return 0;
        int frontWallIndex = Math.min(tallestIndex, secondTallestIndex);
        int backWallIndex = Math.max(tallestIndex, secondTallestIndex);
        int maxArea = (Math.min(height[frontWallIndex], height[backWallIndex])) * (backWallIndex - frontWallIndex);

        for (int i = frontWallIndex; i >= 0; i--) {
            for (int j = backWallIndex; j < height.length; j++) {
                maxArea = Math.max(maxArea, (Math.min(height[i], height[j])) * (j - i));
            }
        }


        return maxArea;
    }
}
