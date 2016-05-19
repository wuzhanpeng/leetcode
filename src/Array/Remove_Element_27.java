package Array;

public class Remove_Element_27 {
	
	public class Solution {
	    public int removeElement(int[] nums, int val) {
	        int l_idx = 0, r_idx = nums.length - 1;
	        while (l_idx <= r_idx) {
	        	while (l_idx < nums.length && val != nums[l_idx]) { ++ l_idx; }
	        	while (r_idx > -1 && val == nums[r_idx]) { -- r_idx; }
	        	if (l_idx < r_idx) {
	        		nums[l_idx ++] = nums[r_idx];
	        		nums[r_idx --] = val;
	        	}
	        }
	        return l_idx;
	    }
	}

	public static void main(String[] args) {
		System.out.println(new Remove_Element_27().new Solution().removeElement(new int[]{3, 2, 2, 3}, 3));
	}

}
