package DynamicProgramming;

public class House_Robber_II_213 {
	
	/**
	 * DP * 2
	 * */
	public class Solution {
	    public int rob(int[] nums) {
	    	int len = nums.length;
	    	if (len == 0) { return 0; }
	    	if (len == 1) { return nums[0]; }
	    	if (len == 2) { return Math.max(nums[0], nums[1]); }
	    	
	        int[] profit1 = new int[len];
	        int[] profit2 = new int[len];
	        profit1[0] = nums[0];
        	profit1[1] = Math.max(nums[0], nums[1]); 
        	profit2[1] = nums[1];
        	profit2[2] = Math.max(nums[1], nums[2]);
	        for (int i = 2; i < len - 1; ++ i) {
	        	profit1[i] = Math.max(profit1[i - 2] + nums[i], profit1[i - 1]);
	        }
	        for (int i = 3; i < len; ++ i) {
	        	profit2[i] = Math.max(profit2[i - 2] + nums[i], profit2[i - 1]);
	        }
	        return Math.max(profit1[len - 2], profit2[len - 1]);
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
