package Array;

public class Move_Zeroes_283 {
	
	public class Solution {
	    public void moveZeroes(int[] nums) {
	        int counter = 0, len = nums.length;
	        for (int i = 0; i < len; ++ i) {
	        	if (0 == nums[i]) { ++ counter; }
	        	else { nums[i - counter] = nums[i]; }
	        }
			while (0 < counter) {
				nums[len - counter] = 0;
				--counter;
			}
	    }
	}

	public static void main(String[] args) {
		int[] nums = new int[]{0, 1, 0, 3, 12};
		new Move_Zeroes_283().new Solution().moveZeroes(nums);
		for (int i : nums) {
			System.out.println(i);
		}
	}

}
