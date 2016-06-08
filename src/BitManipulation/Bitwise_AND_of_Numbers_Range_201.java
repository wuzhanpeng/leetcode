package BitManipulation;

public class Bitwise_AND_of_Numbers_Range_201 {
	
	public class Solution {
	    public int rangeBitwiseAnd(int m, int n) {
//	    	System.out.printf("m: %s\nn: %s\n", Integer.toBinaryString(m), Integer.toBinaryString(n));
	    	int ans = 0;
	        for (int i = 0; i < 32; ++ i) {
        		if (1 == ((m >> i) & 1)) {
        			if (((m & ~0 << (i + 1)) | (~0 >>> (31 - i))) >= n) {
        				ans |= 1 << i;
        			}
        		}
	        }
	        System.out.println(ans);
	        return ans;
	    }
	}

	public static void main(String[] args) {
		new Bitwise_AND_of_Numbers_Range_201().new Solution().rangeBitwiseAnd(5, 7);
		new Bitwise_AND_of_Numbers_Range_201().new Solution().rangeBitwiseAnd(600000000, 2147483645);
		new Bitwise_AND_of_Numbers_Range_201().new Solution().rangeBitwiseAnd(6, 7);
		new Bitwise_AND_of_Numbers_Range_201().new Solution().rangeBitwiseAnd(3, 3);
		new Bitwise_AND_of_Numbers_Range_201().new Solution().rangeBitwiseAnd(6, 8);
//		String zeros = "00000000000000000000000000000000";
//		for (int i = 1; i < Integer.MAX_VALUE && i > 0; i <<= 1) {
//			String bs = Integer.toBinaryString(i);
//			System.out.printf("%s%s - %d\n", zeros.substring(bs.length()), bs, i);
//		}
	}
}
