package DynamicProgramming;

public class Counting_Bits_338 {
	
	public class Solution {
	    public int[] countBits(int num) {
	    	int[] count = new int[num + 1];
	    	count[0] = 0; 
	    	if (num > 0) { count[1] = 1; }
	    	int ini = 2;
	        for (int i = 2; i <= num; ++ i) {
	        	if (ini * 2 <= i) { ini *= 2; }
	        	count[i] = count[i - ini] + 1;
	        }
	        return count;
	    }
	}

	public static void main(String[] args) {
		int[] t = new Counting_Bits_338().new Solution().countBits(5);
		for (int x : t) { System.out.println(x); }
	}

}
