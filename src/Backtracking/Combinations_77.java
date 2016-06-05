package Backtracking;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import leetcode.util.Debug;

public class Combinations_77 {
	
	public class Solution {
		private List<List<Integer>> res = new LinkedList<List<Integer>>();
	    public List<List<Integer>> combine(int n, int k) {
	        backtracking(new Integer[k], n, 0, k, 0);
	        return res;
	    }
	    private void backtracking(Integer[] seq, int n, int idx, int k, Integer prev) {
	    	if (0 == k) {
	    		//debug
	    		Debug.printArray(seq);
	    		res.add(Arrays.asList(seq.clone()));
	    		return;
	    	}
			for (int i = prev + 1; i <= n - k + 1; ++ i) {
				seq[idx] = i;
				backtracking(seq, n, idx + 1, k - 1, i);
			}
		}
	}

	public static void main(String[] args) {
		new Combinations_77().new Solution().combine(5, 3);
	}

}
