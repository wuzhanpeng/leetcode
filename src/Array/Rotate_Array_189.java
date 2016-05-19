package Array;

public class Rotate_Array_189 {
	
	public class Solution {
	    public void rotate(int[] nums, int k) {
	    	k %= nums.length;
	    	int[] firstK = new int[k];
	    	for (int i = 0; i < k; ++ i) { firstK[i] = nums[i]; }
	        for (int i = 0; i < k; ++ i) {
	        	int idx, prev = firstK[i];
	        	for (idx = i + k; idx < nums.length; idx += k) {
	        		int tmp = nums[idx];
	        		nums[idx] = prev;
	        		prev = tmp;
	        	}
	        	nums[idx % nums.length] = prev;
	        }
	    }
	}

	public static void main(String[] args) {
		int[] t = new int[]{1,2};
		new Rotate_Array_189().new Solution().rotate(t, 3);
		for (int x:t) {System.out.println(x);}
	}

}
