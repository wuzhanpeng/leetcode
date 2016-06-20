package BinaryTree;

import leetcode.util.TreeNode;

public class Lowest_Common_Ancestor_of_a_Binary_Tree_236 {
	
	public class Solution {
	    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	    	if (null == root) { return null; }
	    	if (root == p || root == q) { return root; }
	    	TreeNode l = lowestCommonAncestor(root.left, p, q);
	    	TreeNode r = lowestCommonAncestor(root.right, p, q);
	    	if (null != l && null != r) { return root; }
	    	return (null == l) ? r : l;
	    }
	}

	public static void main(String[] args) {
	}

}
