package Math;

public class Ugly_Number_263 {
	
	/** <a>https://en.wikipedia.org/wiki/Pollard%27s_rho_algorithm</a> */
	public class Solution {
	    public boolean isUgly(int num) {
	    	if (0 == num) return false;
	    	// 2/3/5
	    	while (0 == num%2) { num /= 2; }
	    	while (0 == num%3) { num /= 3; }
	    	while (0 == num%5) { num /= 5; }
	    	if (1 == num) return true;
	        return false;
	    }
	}

	public static void main(String[] args) {
		System.out.println(new Ugly_Number_263().new Solution().isUgly(0));
	}

}
