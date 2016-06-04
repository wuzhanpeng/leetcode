package Array;

public class Search_in_Rotated_Sorted_Array_II_81 {
	
	public class Solution {
	    public boolean search(int[] nums, int target) {
	    	int l = 0, r = nums.length - 1, max = -1;
	        if (nums[l] >= nums[r]) {
	        	max = findMax(nums, 0, nums.length - 1);
	        	if (target < nums[max + 1]) { return false; }
	        	else if (target <= nums[nums.length - 1]) { l = max + 1; }
	        	else if (target <= nums[max]) { r = max; }
	        	else { return false; }
	        }
	        while (l < r) {
	        	int mid = (l + r) / 2;
	        	if (target < nums[mid]) { r = mid; }
	        	else if (target > nums[mid]) { l = mid + 1; }
	        	else { return true; }
	        }
	        return target == nums[l] ? true : false;
	    }
	    private int findMax(int[] nums, int l, int r) {
			if (l == r) { return l;}
			if (nums[l] < nums[r]) { return r; }
			else {
				if (1 >= r - l) { return l;}
				int mid = (l + r) / 2;
				if (nums[mid] < nums[l]) {
					return findMax(nums, l, mid - 1);
				} else {
					return findMax(nums, mid, r);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Search_in_Rotated_Sorted_Array_II_81().new Solution().search(new int[]{1,3,1,1,1}, 3));
	}

}
