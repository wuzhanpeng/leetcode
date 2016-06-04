package Array;

public class Search_in_Rotated_Sorted_Array_II_81 {
	
	public class Solution {
	    public boolean search(int[] nums, int target) {
	    	int l = 0, r = nums.length - 1;	        
	        while (l < r) {
	        	int mid = (l + r) / 2;
	        	if (target == nums[l] || target == nums[mid] || target == nums[r]) { return true; }
	        	if (nums[mid] > nums[l]) {
	        		if (target > nums[l] && target < nums[mid]) { r = mid - 1; }
	        		else { l = mid + 1; }
	        	} else if (nums[mid] < nums[l]) {
	        		if (target > nums[mid] && target < nums[r]) { l = mid + 1; }
	        		else { r = mid - 1; }
	        	} else { ++ l; }
	        }
	        return target == nums[l] ? true : false;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Search_in_Rotated_Sorted_Array_II_81().new Solution().search(new int[]{1,3,1,1,1}, 3));
		System.out.println(new Search_in_Rotated_Sorted_Array_II_81().new Solution().search(new int[]{0,0,1,1,2,0}, 2));
		System.out.println(new Search_in_Rotated_Sorted_Array_II_81().new Solution().search(new int[]{2,2,2,0,2,2}, 0));
	}

}
