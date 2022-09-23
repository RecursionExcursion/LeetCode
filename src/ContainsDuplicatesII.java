import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ContainsDuplicatesII {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 0, 1, 1};
        int[] nums3 = {1, 2, 3, 1, 2, 3};
        int[] nums4 = {4, 1, 2, 3, 1, 5};

        System.out.println(containsNearbyDuplicate(nums1, 3));
        System.out.println(containsNearbyDuplicate(nums2, 1));
        System.out.println(containsNearbyDuplicate(nums3, 2));
        System.out.println(containsNearbyDuplicate2(nums4, 3));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k == 0) {
            return false;
        }

        for (int i = 0; i < nums.length; i++) {

            List<Integer> integerList = new ArrayList<>();

            int j = i + 1;
            while (integerList.size() < k && j < nums.length) {
                integerList.add(nums[j++]);
            }
            if (integerList.contains(nums[i])) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsNearbyDuplicate2(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(i > k) set.remove(nums[i-k-1]);
            if(!set.add(nums[i])) return true;
        }
        return false;
    }
}
