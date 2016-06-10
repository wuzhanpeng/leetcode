package Greedy;

public class Patching_Array_330 {
	
	/** Have not been solved */
	public class Solution {
	    public int minPatches(int[] nums, int n) {
	        int cnt = 0,i=0;
	        for(long known_sum = 1;known_sum <= n;){
	            if(i < nums.length && known_sum >= nums[i]){
	                known_sum += nums[i++];
	            }else{
	                known_sum <<= 1;
	                cnt++;
	            }
	        }
	        return cnt;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
