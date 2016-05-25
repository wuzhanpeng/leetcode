package Array;

public class Sort_Colors_75 {
	
	/** https://leetcode.com/discuss/94557/simple-one-pass-solution */
	public class Solution {
	    public void sortColors(int[] nums) {
	        int l = 0, r = nums.length - 1;
	        for (int i = 0; i <= r;) {
	        	if (nums[i] == 0) {
	        		nums[i ++] = nums[l];
	        		nums[l ++] = 0;
	        	} else if (nums[i] == 2) {
	        		nums[i] = nums[r];
	        		nums[r --] = 2;
	        	} else {
					++ i;
				}
	        }
	    }
	}

	public static void main(String[] args) {
		new Sort_Colors_75().new Solution().sortColors(new int[]{0,1,2,0,2});
		new Sort_Colors_75().new Solution().sortColors(new int[]{2,1,0,2,0});
	}

}
