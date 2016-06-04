package Array;

public class Search_in_Rotated_Sorted_Array_33 {
	
	public class Solution {
		// ascending
	    public int search(int[] nums, int target) {
	        int l = 0, r = nums.length - 1, max = -1;
	        if (nums[l] > nums[r]) {
	        	max = findMax(nums, 0, nums.length - 1);
	        	if (target < nums[max + 1]) { return -1; }
	        	else if (target <= nums[nums.length - 1]) { l = max + 1; }
	        	else if (target <= nums[max]) { r = max; }
	        	else { return -1; }
	        }
	        while (l < r) {
	        	int mid = (l + r) / 2;
	        	if (target < nums[mid]) { r = mid; }
	        	else if (target > nums[mid]) { l = mid + 1; }
	        	else { return mid; }
	        }
	        return target == nums[l] ? l : -1;
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
		// find max
//		System.out.println(new Search_in_Rotated_Sorted_Array_33().new Solution().search(new int[]{1,2,3,4,5}, 1));
//		System.out.println(new Search_in_Rotated_Sorted_Array_33().new Solution().search(new int[]{4,5,1,2,3}, 1));
		System.out.println(new Search_in_Rotated_Sorted_Array_33().new Solution().search(new int[]{2,3,4,5,1}, 1));
//		System.out.println(new Search_in_Rotated_Sorted_Array_33().new Solution().search(new int[]{3,4,5,1,2}, 1));
	}

}
