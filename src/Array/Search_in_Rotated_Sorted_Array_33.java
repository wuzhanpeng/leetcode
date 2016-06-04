package Array;

public class Search_in_Rotated_Sorted_Array_33 {
	
	public class Solution {
		// ascending
	    public int search(int[] nums, int target) {
	        int l = 0, r = nums.length - 2;
	    	while (l < r) {
	    		int mid = (l + r) / 2;
	    		if (nums[mid] < nums[mid + 1]) { l = mid + 1; }
	    		else { break; }
	    	}
//	        while (l < r) {
//	        	int mid = (l + r) / 2;
//	        	if (target < nums[mid]) { r = mid; }
//	        	else if (target > nums[mid]) { l = mid + 1; }
//	        	else { return mid; }
//	        }
//	        return target == nums[l] ? l : -1;
	    	return l;
	    }
	}

	public static void main(String[] args) {
		// find max
		System.out.println(new Search_in_Rotated_Sorted_Array_33().new Solution().search(new int[]{1,2,3,4,5}, 0));
		System.out.println(new Search_in_Rotated_Sorted_Array_33().new Solution().search(new int[]{4,5,1,2,3}, 0));
		System.out.println(new Search_in_Rotated_Sorted_Array_33().new Solution().search(new int[]{2,3,4,5,1}, 0));
		System.out.println(new Search_in_Rotated_Sorted_Array_33().new Solution().search(new int[]{3,4,5,1,2}, 0));
	}

}
