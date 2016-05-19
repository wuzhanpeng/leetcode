package Array;

public class Plus_One_66 {
	
	public class Solution {
	    public int[] plusOne(int[] digits) {
	    	int plus = 1;
	        for (int i = digits.length - 1; i > -1; -- i) {
	        	int sum = digits[i] + plus;
	        	digits[i] = sum%10;
	        	plus = sum/10;
	        }
	        if (0 != plus) {
	        	int[] nums = new int[digits.length + 1];
	        	nums[0] = plus;
	        	for (int i = digits.length - 1; i > -1; -- i) {
	        		nums[i + 1] = digits[i];
	        	}
	        	return nums;
	        }
	        return digits;
	    }
	}

	public static void main(String[] args) {
		int[] d1 = new Plus_One_66().new Solution().plusOne(new int[]{9, 9, 9, 9});
		for (int x : d1) { System.out.printf("%d", x); }
	}

}
