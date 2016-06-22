package Backtracking;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Permutations_II_47 {
	
	// slow
//	public class Solution {
//	    private List<List<Integer>> perm = new LinkedList<List<Integer>>();
//	    private HashSet<List<Integer>> set = new HashSet<>();
//	    public List<List<Integer>> permuteUnique(int[] nums) {
//	    	Integer[] order = new Integer[nums.length];
//	    	boolean[] canUse = new boolean[nums.length];
//	    	for (int i = 0; i < nums.length;) { canUse[i ++] = true; }
//	    	backtracking(nums, canUse, order, 0);
//	        return perm;
//	    }
//	    private void backtracking(int[] nums, boolean[] canUse, Integer[] order, int idx) {
//	    	if (idx == order.length) {
//	    		List<Integer> ret = Arrays.asList(order.clone());
//	    		if (!set.contains(ret)) {
//	    			perm.add(ret);
//	    			set.add(ret);
//	    		}
//	    		return;
//	    	}
//			for (int i = 0; i < nums.length; ++ i) {
//				if (!canUse[i]) { continue; }
//				order[idx] = nums[i];
//				canUse[i] = false;
//				backtracking(nums, canUse, order, idx + 1);
//				canUse[i] = true;
//			}
//		}
//	}
	
	// fast
	public class Solution {
	    private List<List<Integer>> perm = new LinkedList<List<Integer>>();
	    public List<List<Integer>> permuteUnique(int[] nums) {
	    	Integer[] order = new Integer[nums.length];
	    	boolean[] canUse = new boolean[nums.length];
	    	for (int i = 0; i < nums.length;) { canUse[i ++] = true; }
	    	backtracking(nums, canUse, order, 0);
	        return perm;
	    }
	    private void backtracking(int[] nums, boolean[] canUse, Integer[] order, int idx) {
	    	if (idx == order.length) {
	    		perm.add(Arrays.asList(order.clone()));
	    		return;
	    	}
	    	HashSet<Integer> set = new HashSet<>();
			for (int i = 0; i < nums.length; ++ i) {
				if (!canUse[i] || set.contains(nums[i])) { continue; }
				set.add(nums[i]);
				
				order[idx] = nums[i];
				canUse[i] = false;
				backtracking(nums, canUse, order, idx + 1);
				canUse[i] = true;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
