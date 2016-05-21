package Backtracking;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import leetcode.util.Debug;

public class Combination_Sum_III_216 {
	
	public class Solution {
	    private List<List<Integer>> combination = new LinkedList<List<Integer>>();
	    public List<List<Integer>> combinationSum3(int k, int n) {
	        // k must less than 10
	    	if (k > 9 || n > (19 - k) * k / 2) { return combination; }
	    	if (1 == k) { combination.add(Arrays.asList(new Integer[]{n})); }
	        Integer[] set = new Integer[k];
	        backtracking(set, 0, 1, n, n);
	        return combination;
	    }
	    private void backtracking(Integer[] set, int idx, int num, int remain, int n) {
	    	if (idx == set.length - 1) {
	    		if (remain > set[idx - 1] && remain <= 9) {
		    		set[idx] = remain;
		    		Debug.printArray(set);
		    		combination.add(Arrays.asList(set.clone()));
	    		}
	    		return; 
	    	}
	    	if (remain <= 0) { return; }
			for (; num <= 9; ++ num) {
				set[idx] = num;
				backtracking(set, idx + 1, num + 1, remain - num, n);
			}
		}
	}

	public static void main(String[] args) {
//		new Combination_Sum_III_216().new Solution().combinationSum3(3, 9);
		new Combination_Sum_III_216().new Solution().combinationSum3(6, 35);
	}

}
