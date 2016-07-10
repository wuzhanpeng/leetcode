package Array;

public class Minimum_Size_Subarray_Sum_209 {
	
	public class Solution {
		/**		find the minimal length of a subarray of which the sum == s */
//	    public int minSubArrayLen(int s, int[] nums) {
//	        int l = 0, r = 0;
//	        int sum = 0, ans = Integer.MAX_VALUE;
//	        for (; r < nums.length; ++ r) {
//	        	if (s == nums[r]) { return 1; }
//	        	sum += nums[r];
//				while (s <= sum && l < nums.length) {
//					sum -= nums[l ++];
//				}
//	        	if (s == sum) {
//	        		ans = Math.min(ans, r - l + 1);
//	        		sum -= nums[l ++];
//	        	}
//	        }
//	        return ans == Integer.MAX_VALUE ? 0 : ans;
//	    }
	    
		/**		find the minimal length of a subarray of which the sum >= s */
	    public int minSubArrayLen(int s, int[] nums) {
	        int l = 0, r = 0;
	        int sum = 0, ans = Integer.MAX_VALUE;
	        for (; r < nums.length; ++ r) {
	        	if (s <= nums[r]) { return 1; }
	        	sum += nums[r];
				while (s <= sum && l < nums.length) {
					ans = Math.min(ans, r - l + 1);
					sum -= nums[l ++];
				}
	        }
	        return ans == Integer.MAX_VALUE ? 0 : ans;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Minimum_Size_Subarray_Sum_209().new Solution().minSubArrayLen(7, new int[]{2,3,1,2,4,3});
	}

}
