package BitManipulation;

import java.util.ArrayList;
import java.util.List;

public class Gray_Code_89 {
	
	public class Solution {
	    public List<Integer> grayCode(int n) {
	        int len = ~0 >>> (32 - n);
	        List<Integer> seq = new ArrayList<Integer>(Math.max(len, 8));
	        seq.add(0);
	        for (int bit = 0, prev_len = 1, idx = 1; bit < n; ++ bit) {
	        	int elm = 1 << bit;
	        	while (prev_len -- > 0) {	        		
	        		seq.add(elm | seq.get(prev_len));
	        		++ idx;
	        	}
	        	prev_len = idx;
	        }
	        return seq;
	    }
	}

	public static void main(String[] args) {
//		int[] nums = new int[]{0,1,3,2,6,7,5,4,12,13,15,14,10,11,9,8};
//		for (int x : nums) {
//			for (int i = 4; i - Integer.toBinaryString(x).length() > 0; -- i) {
//				System.out.printf("%d", 0);}
//			System.out.printf("%s\n", Integer.toBinaryString(x));
//		}
		List<Integer> seq = new Gray_Code_89().new Solution().grayCode(0);
		while (!seq.isEmpty()) {
			System.out.printf(" %d", seq.remove(0));
		}
	}

}
