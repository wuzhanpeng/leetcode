package Set;

import java.util.HashSet;

public class Contains_Duplicate_217 {
	
	public class Solution {
	    public boolean containsDuplicate(int[] nums) {
	        HashSet<Integer> set = new HashSet<Integer>();
	        for (int num :nums) {
	        	if (set.contains(num)) { return true; }
	        	set.add(num);
	        }
	        return false;
	    }
	}

	public static void main(String[] args) {
	}

}
