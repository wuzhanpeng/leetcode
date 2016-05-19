package BitManipulation;

public class Power_of_Two_231 {
	
	public class Solution {
	    public boolean isPowerOfTwo(int n) {
	    	return 0 < n && 0 == (n & (n - 1));
	    }
	}

	public static void main(String[] args) {
		int i = 2;
		while (i < Integer.MAX_VALUE && i > 0) {
			System.out.printf("%d\n", i);
			i *= 2;
		}
	}

}
