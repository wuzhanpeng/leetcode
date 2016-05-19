package Set;

import java.util.HashSet;

public class Single_Number_III_260 {
	
	public class Solution {
	    public int[] singleNumber(int[] nums) {
	        HashSet<Integer> set = new HashSet<Integer>();
	        for (int x : nums) { 
	        	if (set.contains(x)) {
	        		set.remove(x);
	        	} else {
	        		set.add(x);
	        	}
	        }
	        int[] ret = new int[2];
	        int i = 0;
	        for (Integer x : set) { ret[i ++] = x; };
	        return ret;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
