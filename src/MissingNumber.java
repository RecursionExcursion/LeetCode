import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {

        int[] arr = {3, 0, 1};
        int[] arr2 = {0, 1};
        int[] arr3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int[] arr4 = {1};

        System.out.println(missingNumber(arr));
        System.out.println(missingNumber(arr2));
        System.out.println(missingNumber(arr3));
        System.out.println(missingNumber(arr4));
    }


    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums[0] != 0) return 0;
        int i = 1;
        for (; i < nums.length; i++) {
            if (nums[i] != i) return i;
        }
        return nums[i - 1] + 1;
    }
}
