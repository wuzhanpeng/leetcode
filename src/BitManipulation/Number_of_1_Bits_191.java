package BitManipulation;

public class Number_of_1_Bits_191 {
	
	/** <a>https://en.wikipedia.org/wiki/Hamming_weight</a> */
	public class Solution {
	    // you need to treat n as an unsigned value
	    public int hammingWeight(int n) {	    	
	    	int counter = 0;
	        // 32-bit
	    	for (int i = 0; i < 32; ++ i) {
	    		counter += (n >> i) & 0x00000001;
	    	}
	    	return counter;
	    }
	}

	public static void main(String[] args) {
		System.out.println(new Number_of_1_Bits_191()
				.new Solution().hammingWeight(127));
	}

}
