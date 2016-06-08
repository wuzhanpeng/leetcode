package Backtracking;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import leetcode.util.Debug;

public class Subsets_II_90 {
	
	public class Solution {
		private List<List<Integer>> subSets = new LinkedList<List<Integer>>();
		private HashSet<List<Integer>> checkedSet = new HashSet<List<Integer>>();
	    public List<List<Integer>> subsetsWithDup(int[] nums) {
	    	subSets.add(Arrays.asList(new Integer[]{}));
	    	List<Integer> tot = new LinkedList<>();
	    	for (int num : nums) { tot.add(num); }
	    	subSets.add(tot);
	    	Arrays.sort(nums);
	    	backtracking(nums, nums.length / 2, 0, new boolean[nums.length]);
	    	Debug.printLists(subSets);
	        return subSets;
	    }
	    private void backtracking(int[] ref, int k, int idx, boolean[] tags) {
	    	if (k == 0) { return; }
			for (int i = idx; i < ref.length; ++ i) {
				if (!tags[i]) {
					tags[i] = true;
					add2Sets(ref, tags, k == 1);
					backtracking(ref, k - 1, i, tags);
					tags[i] = false;
				}
			}
		}
	    private void add2Sets(int[] ref, boolean[] tags, boolean isEven) {
			List<Integer> A = new LinkedList<>(), S = new LinkedList<>();
			for (int i = 0; i < tags.length; ++ i) {
				if (tags[i]) {
					A.add(ref[i]);
				} else {
					S.add(ref[i]);
				}
			}
			if (!checkedSet.contains(A)) {
				subSets.add(A);
				checkedSet.add(A);
			}
			if (!(tags.length % 2 == 0 && isEven) && !checkedSet.contains(S)) {
				subSets.add(S);
				checkedSet.add(S);
			}
//			Debug.printArray(A);Debug.printArray(S);
		}
	}

	public static void main(String[] args) {
		new Subsets_II_90().new Solution().subsetsWithDup(new int[]{1,2,2});
		new Subsets_II_90().new Solution().subsetsWithDup(new int[]{4,4,4,1,4});
	}

}
