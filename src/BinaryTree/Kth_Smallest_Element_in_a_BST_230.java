package BinaryTree;

import leetcode.util.TreeNode;

public class Kth_Smallest_Element_in_a_BST_230 {
	
	public class Solution {
		private int idx = 0, res = 0;
	    public int kthSmallest(TreeNode root, int k) {
	    	inorderTraversal(root, k);
	    	return res;
	    }
	    private void inorderTraversal(TreeNode node, int k) {
			if (null == node) { return; }
			inorderTraversal(node.left, k);
			if (idx < k) { res = node.val; ++ idx; }
			else { return; }
			inorderTraversal(node.right, k);
		}
	}

	public static void main(String[] args) {
	}

}
