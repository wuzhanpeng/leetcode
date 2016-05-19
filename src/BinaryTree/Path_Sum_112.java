package BinaryTree;

import leetcode.util.TreeNode;

public class Path_Sum_112 {
	
	public class Solution {
		private int ret = 0;
	    public boolean hasPathSum(TreeNode root, int sum) {
	    	if (null == root) { return false; }
	    	ret += root.val;
	    	if (ret == sum && null == root.left && null == root.right) {
	    		return true;
	    	} else {
	    		if (hasPathSum(root.left, sum) || hasPathSum(root.right, sum)) { return true; }
	    		ret -= root.val;
	    		return false;
	    	}
	    }
	}

	public static void main(String[] args) {
	}

}
