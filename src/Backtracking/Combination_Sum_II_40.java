package Backtracking;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Combination_Sum_II_40 {
	
	public class Solution {
		List<List<Integer>> ret = new LinkedList<>();
	    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
	    	if (0 == target) {
	    		ret.add(Arrays.asList(new Integer[]{}));
	    		return ret;
	    	}
	    	Arrays.sort(candidates);
	        backtracking(candidates, target, new LinkedList<>(), 0);
	        return ret;
	    }
	    @SuppressWarnings("unchecked")
		private void backtracking(int[] candidates, int target, 
	    		LinkedList<Integer> ans, int currIdx) {
	    	HashSet<Integer> set = new HashSet<>();
	    	for (int i = currIdx; i < candidates.length && candidates[i] <= target; ++ i) {
	    		if (set.contains(candidates[i])) { continue; }
	    		else { set.add(candidates[i]); }
	    		ans.add(candidates[i]);
	    		if (0 == target - candidates[i]) { ret.add((List<Integer>) ans.clone()); }
	    		else { backtracking(candidates, target - candidates[i], ans, i + 1); }
	    		ans.removeLast();
	    	}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
