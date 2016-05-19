package Array;

public class Remove_Duplicates_from_Sorted_Array_26 {
	
	public class Solution {
	    public int removeDuplicates(int[] nums) {
	    	if (null == nums || 0 == nums.length) { return 0; }
	        int prev = nums[0], dup_idx = 1, i = 1;
	        while (i < nums.length && prev != nums[i]) {
	        	prev = nums[i];
	        	++ dup_idx; ++ i;
	        }
	        for (++ i; i < nums.length; ++ i) {
	        	if (prev == nums[i]) { continue; }
	        	else {
	        		nums[dup_idx ++] = nums[i];
	        		prev = nums[i];
	        	}
	        }
	        return dup_idx;
	    }
	}

	public static void main(String[] args) {
		int[] test = new int[]{1,1,1,1,2};
		int len = new Remove_Duplicates_from_Sorted_Array_26().new Solution().removeDuplicates(test);
		System.out.printf("length: %d\n", len); for (int i = 0; i < len; ++ i) { System.out.printf("%d ", test[i]); }
	}

}
