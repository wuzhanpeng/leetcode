package Array;

public class Find_Minimum_in_Rotated_Sorted_Array_153 {	
	
	public class Solution {
		
		private int binarySearch(int[] nums, int l, int r) {
			int mid = (l + r) / 2;
			if (nums[l] > nums[mid]) { return binarySearch(nums, l, mid); }
			if (nums[r] < nums[mid]) { return binarySearch(nums, mid + 1, r); }
			return nums[l];
		}
	    public int findMin(int[] nums) {
	        return binarySearch(nums, 0, nums.length - 1);
	    }
	}

	public static void main(String[] args) {
		System.out.println(new Find_Minimum_in_Rotated_Sorted_Array_153().new Solution()
				.findMin(new int[]{4, 5, 6, 7, 0, 1, 2}));
		System.out.println(new Find_Minimum_in_Rotated_Sorted_Array_153().new Solution()
				.findMin(new int[]{4, 5, 6, 7, 0}));
		System.out.println(new Find_Minimum_in_Rotated_Sorted_Array_153().new Solution()
				.findMin(new int[]{1, 2, 3, 4}));
		System.out.println(new Find_Minimum_in_Rotated_Sorted_Array_153().new Solution()
				.findMin(new int[]{0}));
	}

}
