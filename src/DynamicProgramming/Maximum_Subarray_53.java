package DynamicProgramming;

public class Maximum_Subarray_53 {
	
	public class Solution {
	    public int maxSubArray(int[] nums) {
	        int max = Integer.MIN_VALUE, acc = 0;
	        for (int x : nums) {
	        	if (x + acc >= 0) {
	        		acc += x;
	        		if (acc > max) {
	        			max = acc;
	        		}
	        	} else {
					acc = 0;
					if (x > max) {
	        			max = x;
	        		}
				}
	        }
	        return max;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
