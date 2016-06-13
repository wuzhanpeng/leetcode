package Array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class _4Sum_18 {
	
	public class Solution {
		private List<List<Integer>> ans = new LinkedList<>();
	    public List<List<Integer>> fourSum(int[] nums, int target) {
	    	if (4 > nums.length) { return ans; }
	    	Arrays.sort(nums);
	    	for (int i = 0; i < nums.length - 3; ++ i) {
	    		if (i > 0 && nums[i] == nums[i - 1]) { continue; }
	    		for (int j = i + 1; j < nums.length - 2; ++ j) {
	    			if (j > i + 1 && nums[j] == nums[j - 1]) { continue; }
	    			_2Sum(nums, j + 1, nums[i], nums[j], target);
	    		}
	    	}
	    	return ans;
	    }
	    private void _2Sum(int[] nums, int beg, int _1, int _2, int target) {
	    	int i = beg, j = nums.length - 1;
	    	while (i < j) {
	    		int sum = _1 + _2 + nums[i] + nums[j];
	    		if (sum == target) {
	    			ans.add(Arrays.asList(new Integer[]{_1, _2, nums[i], nums[j]}));
	    			// Avoid duplicates
	    			while (i < j && nums[i] == nums[i + 1]) { ++ i; }
	    			while (i < j && nums[j] == nums[j - 1]) { -- j; }
	    			++ i; -- j;
	    		} else if (sum < target) { ++ i; }
	    		else { -- j; }
	    	}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
