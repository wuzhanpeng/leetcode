package Greedy;

public class Jump_Game_55 {
	
	public class Solution {
	    public boolean canJump(int[] nums) {
	    	int len = nums.length, reachablePos = 0;
	        for (int i = 0; i < len; ++ i) {
	        	if (i <= reachablePos) {
	        		reachablePos = Math.max(reachablePos, i + nums[i]);
	        	} else {
					return false;
				}
	        }
	        return true;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
