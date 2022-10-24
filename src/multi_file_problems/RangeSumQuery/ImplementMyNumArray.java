package multi_file_problems.RangeSumQuery;

public class ImplementMyNumArray {
    public static void main(String[] args) {
        int[] nums ={-2, 0, 3, -5, 2, -1};

        int left = 0;
        int right = 2;



        NumArray obj = new NumArray(nums);
        int param_1 = obj.sumRange(left, right);

        System.out.println(param_1);
    }
}
