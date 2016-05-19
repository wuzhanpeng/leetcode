package BinaryTree;

import leetcode.util.TreeNode;

public class Balanced_Binary_Tree_110 {
	
	public class Solution {
		private int height(TreeNode root) {
			if (null == root) { return 0; }
			int left = height(root.left);
			int right = height(root.right);
			if (-1 == left || -1 == right) { return -1; }
			if (1 < Math.abs(left - right)) { return -1; }
			return Math.max(left, right) + 1;
		}
	    public boolean isBalanced(TreeNode root) {
	        return (-1 != height(root));
	    }
	}

	public static void main(String[] args) {
	}

}
