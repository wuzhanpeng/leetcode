package BinaryTree;

import java.util.LinkedList;
import java.util.List;

import leetcode.util.TreeNode;

public class Path_Sum_II_113 {
	
	public class Solution {
		private LinkedList<Integer> seq = new LinkedList<>();
		private List<List<Integer>> ans = new LinkedList<>();
	    public List<List<Integer>> pathSum(TreeNode root, int sum) {
	    	dfs(root, sum);
	    	return ans;
	    }
	    @SuppressWarnings("unchecked")
		private void dfs(TreeNode node, int sum) {
	    	if (null == node) { return; }
//	    	add the `sum` from two negative number
//	    	if (sum < node.val) { return; }
	    	seq.add(node.val);
	    	if (null == node.left && null == node.right && sum == node.val) {	        	
	        	ans.add((List<Integer>) seq.clone());
	        	seq.removeLast();
	        	return;
	        }
	    	dfs(node.left, sum - node.val);
	    	dfs(node.right, sum - node.val);
	    	seq.removeLast();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
