package Math;

public class Pow_50 {
	
	public class Solution {
	    public double myPow(double x, int n) {
	    	if (0 == n) { return 1; }
	    	double pow = myPow(x, n / 2);
	    	if (0 == n % 2) {
	    		return pow * pow;
	    	} else {
		    	if (n < 0) { x = 1 / x; }
	    		return pow * pow * x;
			}
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%f", new Pow_50().new Solution().myPow(2, -2147483648));
	}

}
