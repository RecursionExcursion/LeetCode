import java.util.Arrays;

public class IntersectionOfTwoArraysII {
    public static void main(String[] args) {
        int[] n = {1, 2, 2, 1};
        int[] n2 = {2, 2};

        int[] n3 = {4, 9, 5};
        int[] n4 = {9, 4, 9, 8, 4};


        System.out.println(Arrays.toString(intersect(n, n2)));
        System.out.println(Arrays.toString(intersect(n3, n4)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {

        int[] ans = new int[1001];
        int ansIndex = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    nums2[j] = Integer.MIN_VALUE;
                    ans[ansIndex++] = nums1[i];
                    break;
                }
            }
        }

        return Arrays.copyOfRange(ans, 0, ansIndex);
    }

//    public int[] intersect(int[] nums1, int[] nums2) {
//        List<Integer> list1 = new ArrayList<>(nums1.length);
//        List<Integer> list2 = new ArrayList<>(nums2.length);
//
//        for (int i : nums1) list1.add(i);
//        for (int i : nums2) list2.add(i);
//
//        List<Integer> integerList = new ArrayList<>();
//
//        for (int i = 0; i < list1.size(); i++) {
//            for (int j = 0; j < list2.size(); j++) {
//                if (Objects.equals(list1.get(i), list2.get(j))) {
//                    integerList.add(list1.get(i));
//                    list2.remove(j);
//                    break;
//                }
//            }
//        }
//
//        int[] returnArr = new int[integerList.size()];
//        for (int i = 0; i < returnArr.length; i++) {
//            returnArr[i] = integerList.get(i);
//        }
//
//        return returnArr;
//    }
}
