package Math;

public class Integer_Break_343 {
	
	public class Solution {
	    public int integerBreak(int n) {
	    	int prev_pdt = 1, product = 1;
	        for (int pieces = 2; pieces < n; ++ pieces) {
	        	int total = n;
	        	for (int i = pieces; i > 1; -- i) {
	        		int piece = total / i;
	        		product *= piece;
	        		total -= piece;
	        	}
	        	product *= total;
	        	if (prev_pdt < product) {
	        		prev_pdt = product;
	        		product = 1;
	        	} else {
					return prev_pdt;
				}
	        }
	        return prev_pdt;
	    }
	}

	public static void main(String[] args) {
		System.out.println(new Integer_Break_343().new Solution().integerBreak(2));
	}

}
