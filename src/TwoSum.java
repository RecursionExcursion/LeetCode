
public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		int[] twoNums = new int[2];

		for (int i = 0; i <= nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					twoNums[0] = i;
					twoNums[1] = j;
				}
			}
		}
		return twoNums;
	}
}
