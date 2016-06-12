package Array;

import java.util.Arrays;

public class _3Sum_Closest_16 {
	
	public class Solution {
	    public int threeSumClosest(int[] nums, int target) {
	    	int ans = target, min = Integer.MAX_VALUE;
	    	Arrays.sort(nums);
	        for (int i = 0; i < nums.length; ++ i) {
	        	if (i > 0 && nums[i] == nums[i - 1]) { continue; }
        		int j = i + 1, k = nums.length - 1;
    	    	while (j < k) {
    	    		int sum = nums[i] + nums[j] + nums[k];
    	    		if (target == sum) {
    	    			return target;
    	    		} else if (target > sum) { ++ j; }
    	    		else { -- k; }
    	    		
    	    		int delta = Math.abs(sum - target);
    	    		if (delta < min) {
    	    			ans = sum;
    	    			min = delta;
    	    		}
    	    	}
	        }
	        return ans;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
