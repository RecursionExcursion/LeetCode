package com.rloup.leetcode.problems;

public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};

        System.out.println(findMedianOfTwoSortedArrays(nums1, nums2));
        System.out.println(findMedianOfTwoSortedArrays(nums3, nums4));
        System.out.println(findMedianOfTwoSortedArrays(new int[0], new int[]{1}));
        System.out.println(findMedianOfTwoSortedArrays(new int[0], new int[]{2, 3}));
    }

    public static double findMedianOfTwoSortedArrays(int[] nums1, int[] nums2) {

        double d = (nums1.length + nums2.length) / 2.0;
        int[] nums = new int[(int) d + 1];
        int i = 0, j = 0, k = 0;
        while (k <= d) {
            nums[k++] = (i < nums1.length ? nums1[i] : Integer.MAX_VALUE) <=
                    (j < nums2.length ? nums2[j] : Integer.MAX_VALUE) ?
                    nums1[i++] : nums2[j++];
        }
        return d % 1 != 0 ?
                nums[nums.length - 1] :
                (nums.length == 1 ?
                        nums[0] :
                        (nums[nums.length - 1] + nums[nums.length - 2]) / 2.0);
    }
}
