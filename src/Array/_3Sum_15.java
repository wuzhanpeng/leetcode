package Array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class _3Sum_15 {
	
	public class Solution {
		private List<List<Integer>> ans = new LinkedList<>();
	    public List<List<Integer>> threeSum(int[] nums) {
	    	if (3 > nums.length) { return ans; }
	    	Arrays.sort(nums);
	    	_2Sum(nums, 1, nums[0]);
	        for (int i = 1; i < nums.length; ++ i) {
	        	if (nums[i] != nums[i - 1]) {
	        		_2Sum(nums, i + 1, nums[i]);
	        	}
	        }
	        return ans;
	    }
	    private void _2Sum(int[] nums, int beg, int target) {
	    	int i = beg, j = nums.length - 1;
	    	while (i < j) {
	    		int sum = nums[i] + nums[j];
	    		if (0 == sum + target) {
	    			ans.add(Arrays.asList(new Integer[]{target, nums[i], nums[j]}));
	    			// Avoid duplicates
	    			while (i < j && nums[i] == nums[i + 1]) { ++ i; }
	    			while (i < j && nums[j] == nums[j - 1]) { -- j; }
	    			++ i; -- j;
	    		} else if (0 > sum + target) { ++ i; }
	    		else { -- j; }
	    	}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
