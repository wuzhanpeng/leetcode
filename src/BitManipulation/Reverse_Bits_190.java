package BitManipulation;

public class Reverse_Bits_190 {
	
	public class Solution {
		private int[] mask = new int[]{
				0x80000000,
				0x40000000,
				0x20000000,
				0x10000000,
				0x8000000,
				0x4000000,
				0x2000000,
				0x1000000,
				0x800000,
				0x400000,
				0x200000,
				0x100000,
				0x80000,
				0x40000,
				0x20000,
				0x10000,
				0x8000,
				0x4000,
				0x2000,
				0x1000,
				0x800,
				0x400,
				0x200,
				0x100,
				0x80,
				0x40,
				0x20,
				0x10,
				0x8,
				0x4,
				0x2,
				0x1
		};
	    // you need treat n as an unsigned value
	    public int reverseBits(int n) {
	    	int r = 0;
	        for (int i = 0; i < 32; ++ i) {
	        	if (0 != (1 & n)) {
	        		r |= mask[i];
	        	}
	        	n >>>= 1;
	        }
	        return r;
	    }
	}

	public static void main(String[] args) {
//		int i = 0, x = 1<<31;
//		while (i<32) {
//			System.out.println("0x"+Integer.toHexString(x>>>i)+",");
//			++ i;
//		}
		int n = 43261596;
		System.out.println(Integer.toBinaryString(n));
		n = new Reverse_Bits_190().new Solution().reverseBits(n);
		System.out.println(Integer.toBinaryString(n));
	}

}
