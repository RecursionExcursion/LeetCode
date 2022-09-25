import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        int[] nums1 = {0, 1, 2, 4, 5, 7};
        int[] nums2 = {0, 2, 3, 4, 6, 8, 9};

        summaryRanges2(nums1).forEach(System.out::println);
        summaryRanges2(nums2).forEach(System.out::println);

    }

    public static List<String> summaryRanges(int[] nums) {

        List<String> rangeList = new ArrayList<>();

        int start;
        int end;
        int i = 0;
        while (i < nums.length) {
            start = nums[i];
            if (i != nums.length - 1) {
                while (i != nums.length - 1 && nums[i + 1] - nums[i] == 1) {
                    i++;
                }
            }
            end = nums[i++];
            if (start == end) {
                rangeList.add(String.valueOf(start));
            } else {
                rangeList.add(start + "->" + end);
            }
        }
        return rangeList;
    }

    public static List<String> summaryRanges2(int[] nums) {

        List<String> rangeList = new ArrayList<>();

        int start;
        int end;

        int i = 0;
        while (i < nums.length) {
            start = nums[i];
            if (i != nums.length - 1) {
                while (i != nums.length - 1 && nums[i + 1] - nums[i] == 1) {
                    i++;
                }
            }
            end = nums[i++];

            if (start == end) {
                rangeList.add(String.valueOf(start));
            } else {
                rangeList.add(start + "->" + end);
            }
        }
        return rangeList;
    }
}
