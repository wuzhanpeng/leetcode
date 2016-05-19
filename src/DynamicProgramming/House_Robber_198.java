package DynamicProgramming;

public class House_Robber_198 {
	
	public class Solution {
	    public int rob(int[] nums) {
	    	if (null == nums || 0 == nums.length) { return 0; }
	        int[] profit = new int[nums.length];
	    	if (0 < nums.length) { profit[0] = nums[0]; }
	    	if (1 < nums.length) { profit[1] = Math.max(nums[0], nums[1]); }
	        for (int i = 2; i < nums.length; ++ i) {
	        	profit[i] = Math.max(profit[i - 1], profit[i - 2] + nums[i]);
	        }
	        return profit[nums.length - 1];
	    }
	}

	public static void main(String[] args) {
	}

}
