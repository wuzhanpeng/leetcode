package Strategy;

public class Majority_Element_169 {
	
	public class Solution {
	    public int majorityElement(int[] nums) {
	    	int majority = 0, counter = 0;
	        for (int i : nums) {
	        	if (0 == counter) {
	        		majority = i;
	        		++ counter;
	        	} else {
	        		if (i == majority) { ++ counter; }
	        		else { -- counter; }
	        	}
	        }
	        return majority;
	    }
	}

	public static void main(String[] args) {
	}

}
