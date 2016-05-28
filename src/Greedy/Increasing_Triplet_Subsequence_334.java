package Greedy;

public class Increasing_Triplet_Subsequence_334 {
	
	public class Solution {
	    public boolean increasingTriplet(int[] nums) {
	        int min = Integer.MAX_VALUE, snd_min = Integer.MAX_VALUE;
	        for (int num : nums) {
	        	if (num <= min) { min = num; } 
	        	else if (num <= snd_min) { snd_min = num; } 
	        	else { return true; }
	        }
	        return false;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
