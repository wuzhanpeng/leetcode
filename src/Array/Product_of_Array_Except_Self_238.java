package Array;

public class Product_of_Array_Except_Self_238 {
	
	// Recursion method perhaps cause StackOverflow
//	public class Solution {private int cnt = 0;
//	    public int[] productExceptSelf(int[] nums) {
//	    	int[] ret = new int[nums.length];
//	    	inner_recursion(nums, ret, 0, 1);
//	        return ret;
//	    }
//	    private int inner_recursion(int[] nums, int[] tar, int idx, int l) {
//	    	System.out.println(++ cnt);
//			if (idx < nums.length) {
//				int r = inner_recursion(nums, tar, idx + 1, l * nums[idx]);
//				tar[idx] = l * r;
//				return r * nums[idx];
//			}
//			return 1;
//		}
//	}
	
	// Iteration method
	public class Solution {
	    public int[] productExceptSelf(int[] nums) {
	    	int[] ret = new int[nums.length];
	    	int i = 1, l_acc = 1, r_acc = 1;
	    	ret[0] = 1;
	    	while (i < ret.length) { l_acc *= nums[i - 1]; ret[i ++] = l_acc; }
	    	for (i -= 2; i >= 0;) { r_acc *= nums[i + 1]; ret[i --] *= r_acc; }
	        return ret;
	    }
	}

	public static void main(String[] args) {
		int[] t = new Product_of_Array_Except_Self_238().new Solution().productExceptSelf(
				new int[]{1,2});
		for (int x : t) { System.out.printf("%d ", x); }
	}

}
