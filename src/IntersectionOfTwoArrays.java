import java.util.*;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
        System.out.println(Arrays.toString(intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4})));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set = new HashSet<>();
        for (int k : nums1) {
            for (int i : nums2) {
                if (k == i) {
                    set.add(k);
                }
            }
        }

        int[] ans = new int[set.size()];

        int index = 0;
        for (Integer i : set) {
            ans[index++] = i;
        }

        return ans;
    }

//    public static int[] intersection(int[] nums1, int[] nums2) {
//        return Arrays.stream(nums1)
//                    .distinct()
//                     .filter(i -> Arrays.stream(nums2).boxed().toList().contains(i))
//                     .toArray();
//    }

}