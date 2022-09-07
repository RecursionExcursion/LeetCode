
public class RemoveElement {
	public static void main(String[] args) {
		int[] nums = { 4,5,3,4,6,5 };
		System.out.println(removeElementBetter(nums, 5));

	}

	public static int removeElement(int[] nums, int val) {

		int duplicates = 0;

		for (int i = 0; i < nums.length - duplicates; i++) {

			while (i != nums.length - duplicates && nums[i] == val) {

				int lastIndex = nums.length - 1 - duplicates;

				int placeholder = nums[lastIndex];
				nums[lastIndex] = nums[i];
				nums[i] = placeholder;
				duplicates++;

			}
		}

		return nums.length - duplicates;
	}
	
	public static int removeElementBetter(int[] nums, int val) {
        int i = 0;
        for(int num : nums){
            if(num != val){
                nums[i] = num;
                i++;
            }
        }
        return i;
        }
}
