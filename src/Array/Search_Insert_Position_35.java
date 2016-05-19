package Array;

public class Search_Insert_Position_35 {
	
	public class Solution {
	    public int searchInsert(int[] nums, int target) {
	        return binarySearch(nums, target, 0, nums.length);
	    }
	    private int binarySearch(int[] nums, int target, int l, int r) {
			if (l == r) { return l; }
			int mid = (l + r) / 2;
			if (target == nums[mid]) { return mid; }
			else if (target < nums[mid]) { return binarySearch(nums, target, l, mid); } 
			else { return binarySearch(nums, target, mid + 1, r); }
		}
	}

	public static void main(String[] args) {
		System.out.println(new Search_Insert_Position_35().new Solution().searchInsert(
				new int[]{}, 0));
	}

}
