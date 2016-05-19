package BitManipulation;

public class Missing_Number_268 {
	
	public class Solution {
	    public int missingNumber(int[] nums) {
	        int res = nums.length;
	        for (int i = 0; i < nums.length; ++ i) {
	        	res ^= i;
	        	res ^= nums[i];
	        }
	        return res;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Missing_Number_268().new Solution().missingNumber(new int[]{0}));
	}

}
