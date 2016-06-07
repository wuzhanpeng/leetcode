package BinaryTree;

import leetcode.util.TreeNode;

public class Flatten_Binary_Tree_to_Linked_List_114 {
	
	public class Solution {
	    public void flatten(TreeNode root) {
	        if (null == root) { return; }
	        TreeNode l = root.left, r = root.right;
	        root.left = null;
	        TreeNode tail = dfs(l, root);
	        dfs(r, tail);
	    }
	    private TreeNode dfs(TreeNode node, TreeNode mNode) {
	    	if (null == node) { return mNode; }
	    	TreeNode l = node.left, r = node.right;
	    	node.left = null;
	    	mNode.right = node;
	        TreeNode tail = dfs(l, mNode.right);
	        return dfs(r, tail);
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
