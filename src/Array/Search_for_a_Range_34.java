package Array;

public class Search_for_a_Range_34 {
	
	public class Solution {
	    public int[] searchRange(int[] nums, int target) {
	    	int mid = 0, l = 0, r = nums.length - 1;
	        while (l < r) {
	        	mid = (l + r) / 2;
	        	if (target < nums[mid]) {
	        		r = mid;
	        	} else if (target > nums[mid]) {
					l = mid + 1;
				} else {
					break;
				}
	        }
	        mid = (l + r) / 2;
	        if (target == nums[mid]) {
	        	int beg = mid, end = mid;
	        	while (beg > 0 && target == nums[beg - 1]) { -- beg; }
	        	while (end < nums.length - 1 && target == nums[end + 1]) { ++ end; }
	        	return new int[]{beg, end};
	        } else {
				return new int[]{-1, -1};
			}
	    }
	}

	public static void main(String[] args) {
		new Search_for_a_Range_34().new Solution().searchRange(new int[]{1,2}, 2);
	}

}
