package BitManipulation;

public class Single_Number_III_260 {
	
	public class Solution {
	    public int[] singleNumber(int[] nums) {
	    	int ab = 0, pos = -1;
	        for (int x : nums) { ab ^= x; }
	        while ((ab >> ++ pos & 1) == 0);
	        
	        int mask = 1 << pos, a = 0, b = 0;
	        for (int x : nums) {
	        	if ((x & mask) == 0) { a ^= x; }
	        	else { b ^= x; }
	        }
	        return new int[]{a, b};
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Single_Number_III_260().new Solution().singleNumber(new int[]{5,7});
	}

}
