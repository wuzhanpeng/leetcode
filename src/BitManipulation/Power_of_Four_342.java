package BitManipulation;

public class Power_of_Four_342 {
	
	public class Solution {
	    public boolean isPowerOfFour(int num) {
	    	int mask = 1431655765;
	    	return num > 0 && (num & mask) > 0 && 0 == (num & (num - 1));
	    }
	}

	public static void main(String[] args) {
//		int i = 1, sum = 0;
//		while (i < Integer.MAX_VALUE && i > 0) {
//			sum += i;
//			i *= 4;
//		}
//		System.out.println(sum);
		System.out.println(new Power_of_Four_342().new Solution().isPowerOfFour(2));
	}

}
