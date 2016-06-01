package Array;

public class Remove_Duplicates_from_Sorted_Array_II_80 {
	
	public class Solution {
	    public int removeDuplicates(int[] nums) {
	    	if (2 >= nums.length) { return nums.length; }
	        int len = 1;
	        for (int i = 1, times = 1, prev = nums[0]; i < nums.length; ++ i) {
	        	if (prev != nums[i]) {
	        		times = 1;
	        		nums[len ++] = nums[i];
	        	} else {
	        		if (times < 2) { ++ times; nums[len ++] = nums[i]; }
				}
	        	prev = nums[i];
	        }
	        return len;
	    }
	}

	public static void main(String[] args) {
		new Remove_Duplicates_from_Sorted_Array_II_80().new Solution().removeDuplicates(new int[]{1,2,2,2,2,3,3,4,4,4});
	}

}
