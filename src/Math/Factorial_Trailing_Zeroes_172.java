package Math;

public class Factorial_Trailing_Zeroes_172 {
	
	public class Solution {
	    public int trailingZeroes(int n) {
	        int five_count = 0;
	        while (0 < n) {
	        	five_count += n/5;
	        	n /= 5;
	        }
	        return five_count;
	    }
	}

	public static void main(String[] args) {
	}

}
