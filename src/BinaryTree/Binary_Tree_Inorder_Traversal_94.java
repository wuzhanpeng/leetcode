package BinaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import leetcode.util.TreeNode;

public class Binary_Tree_Inorder_Traversal_94 {
	
	public class Solution {
	    public List<Integer> inorderTraversal(TreeNode root) {
	    	Stack<TreeNode> path = new Stack<TreeNode>();
	        List<Integer> inOrderSeq = new LinkedList<Integer>();
	    	TreeNode node = root;
	        while (!path.isEmpty() || null != node) {
		        while (null != node) {
		        	path.add(node);
		        	node = node.left;
		        }
		        if (!path.isEmpty()) { node = path.pop(); }
		        inOrderSeq.add(node.val);
		        node = node.right;
	        }
	        return inOrderSeq;
	    }
	}

	public static void main(String[] args) {
		// build tree
				TreeNode root = new TreeNode(6);
				root.left = new TreeNode(2);
				root.right = new TreeNode(8);
				root.left.left = new TreeNode(0);
				root.left.right = new TreeNode(4);
				root.left.right.left = new TreeNode(3);
				root.left.right.right = new TreeNode(5);
				root.right.left = new TreeNode(7); root.right.right = new TreeNode(9);
				
				List<Integer> seq = new Binary_Tree_Inorder_Traversal_94().new Solution().inorderTraversal(root);
				System.out.println(seq.toString());
	}

}
