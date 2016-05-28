package DynamicProgramming;

public class Longest_Increasing_Subsequence_300 {
	
	/** 
	 * Here introduces a nlogn algorithm, DP + BS
	 * <a>https://www.felix021.com/blog/read.php?1587</a> 
	 * */
	public class Solution {
	    public int lengthOfLIS(int[] nums) {
	    	if (null == nums || 0 == nums.length) { return 0; }
	    	int[] seq = new int[nums.length];
	    	seq[0] = nums[0];
	    	int size = 1;
	    	for (int i = 1; i < nums.length; ++ i) {
	    		// insert
	    		if (nums[i] > seq[size - 1]) { seq[size ++] = nums[i]; }
	    		else {
		    		// binary search
		    		int l = 0, r = size - 1;
		    		boolean isEqual = false;
		    		while (l < r) {
		    			int mid = (l + r) / 2;
		    			if (nums[i] < seq[mid]) { r = mid; }
		    			else if (nums[i] > seq[mid]) { l = mid + 1; }
		    			else { isEqual = true; break; }
		    		}
		    		// replace
		    		if (!isEqual) { seq[l] = nums[i]; }
	    		}
	    	}
	    	return size;
	    }
	}

	public static void main(String[] args) {
//		System.out.println(new Longest_Increasing_Subsequence_300().new Solution().lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
//		System.out.println(new Longest_Increasing_Subsequence_300().new Solution().lengthOfLIS(new int[]{10,9,2,5,3,4}));
//		System.out.println(new Longest_Increasing_Subsequence_300().new Solution().lengthOfLIS(new int[]{1,1,1,2}));
//		System.out.println(new Longest_Increasing_Subsequence_300().new Solution().lengthOfLIS(new int[]{1}));
		System.out.println(new Longest_Increasing_Subsequence_300().new Solution().lengthOfLIS(new int[]{3,5,6,2,5,4,19,5,6,7,12}));
	}

}
