package Array;

public class Find_Peak_Element_162 {
	
	public class Solution {
	    public int findPeakElement(int[] nums) {
	        if (1 == nums.length) { return 0; }
	        if (nums[0] > nums[1]) { return 0; }
	        if (nums[nums.length - 1] > nums[nums.length - 2]) { return nums.length - 1; }
	        
	        int l = 0, r = nums.length - 2;
	        while (l < r) {
	        	int mid = (l + r) / 2;
	        	if (nums[mid] < nums[mid + 1]) { l = mid + 1; }
	        	else { r = mid; }
	        }
	        return l;
	    }
	}

	public static void main(String[] args) {
		System.out.println(new Find_Peak_Element_162().new Solution().findPeakElement(new int[]{1,2,3,1}));
		System.out.println(new Find_Peak_Element_162().new Solution().findPeakElement(new int[]{1,2,3,4}));
		System.out.println(new Find_Peak_Element_162().new Solution().findPeakElement(new int[]{4,3,2,1}));
		System.out.println(new Find_Peak_Element_162().new Solution().findPeakElement(new int[]{1,4,3,1}));
		System.out.println(new Find_Peak_Element_162().new Solution().findPeakElement(new int[]{1,5,4,3,1}));
	}

}
