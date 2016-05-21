package Backtracking;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import leetcode.util.Debug;

public class Permutations_46 {
	
	public class Solution {
	    private List<List<Integer>> perm = new LinkedList<List<Integer>>();
	    public List<List<Integer>> permute(int[] nums) {
	    	Integer[] order = new Integer[nums.length];
	    	boolean[] canUse = new boolean[nums.length];
	    	for (int i = 0; i < nums.length;) { canUse[i ++] = true; }
	    	backtracking(nums, canUse, order, 0);
	        return perm;
	    }
	    private void backtracking(int[] nums, boolean[] canUse, Integer[] order, int idx) {
	    	if (idx == order.length) {
	    		Debug.printArray(order);
	    		perm.add(Arrays.asList(order.clone()));
	    		return;
	    	}
			for (int i = 0; i < nums.length; ++ i) {
				if (!canUse[i]) { continue; }
				order[idx] = nums[i];
				canUse[i] = false;
				backtracking(nums, canUse, order, idx + 1);
				canUse[i] = true;
			}
		}
	}

	public static void main(String[] args) {
		new Permutations_46().new Solution().permute(new int[]{});
	}

}
