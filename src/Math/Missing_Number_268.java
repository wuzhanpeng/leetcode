package Math;

public class Missing_Number_268 {
	
	public class Solution {
	    public int missingNumber(int[] nums) {
	        long sum = (1 + nums.length) * nums.length / 2, acc = 0;
	        for (int x : nums) {
	        	acc += x;
	        }
	        return (int) (sum - acc);
	    }
	}

	public static void main(String[] args) {
		System.out.println(new Missing_Number_268().new Solution().missingNumber(new int[]{0}));
	}

}
