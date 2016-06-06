package Backtracking;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import leetcode.util.Debug;

public class Combination_Sum_39 {
	
	public class Solution {
		List<List<Integer>> ret = new LinkedList<>();
	    public List<List<Integer>> combinationSum(int[] candidates, int target) {
	    	if (0 == target) {
	    		ret.add(Arrays.asList(new Integer[]{}));
	    		return ret;
	    	}
	    	Arrays.sort(candidates);
	        backtracking(candidates, target, new LinkedList<>(), 0);
	        Debug.printLists(ret);
	        return ret;
	    }
	    @SuppressWarnings("unchecked")
		private void backtracking(int[] candidates, int target, 
	    		LinkedList<Integer> ans, int currIdx) {
	    	for (int i = currIdx; i < candidates.length && candidates[i] <= target; ++ i) {
	    		ans.add(candidates[i]);
	    		if (0 == target - candidates[i]) { ret.add((List<Integer>) ans.clone()); }
	    		else { backtracking(candidates, target - candidates[i], ans, i); }
	    		ans.removeLast();
	    	}
		}
	}

	public static void main(String[] args) {
		new Combination_Sum_39().new Solution().combinationSum(new int[]{3,2,7,6}, 7);
	}

}
