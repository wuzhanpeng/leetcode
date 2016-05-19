package BinaryTree;

import leetcode.util.TreeNode;

public class Symmetric_Tree_101 {
	
	public class Solution {
	    public boolean isSymmetric(TreeNode root) {
	        return (null != root ? isSameTree(root.left, root.right) : true);
	    }
	    private boolean isSameTree(TreeNode p, TreeNode q) {
	    	if ((null != p && null == q) || 
	    		(null == p && null != q)) { return false; }
	        return (null != p ? (p.val == q.val) && isSameTree(p.left, q.right) && isSameTree(p.right, q.left) : true);
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
