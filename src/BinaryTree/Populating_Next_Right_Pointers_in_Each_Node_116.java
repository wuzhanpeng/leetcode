package BinaryTree;

import leetcode.util.TreeLinkNode;

public class Populating_Next_Right_Pointers_in_Each_Node_116 {
	
	public class Solution {
		/* perfect binary tree */
	    public void connect(TreeLinkNode root) {
	        if (null != root) {
	        	preorderTraversal(root);
	        }
	    }
	    private void preorderTraversal(TreeLinkNode node) {
			if (null == node.left || null == node.right) { return; }
			node.left.next = node.right;
			if (null != node.next) { node.right.next = node.next.left; }
			preorderTraversal(node.left);
			preorderTraversal(node.right);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
