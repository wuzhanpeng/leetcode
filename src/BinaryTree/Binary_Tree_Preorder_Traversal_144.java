package BinaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import leetcode.util.TreeNode;

public class Binary_Tree_Preorder_Traversal_144 {
	
	public class Solution {
	    public List<Integer> preorderTraversal(TreeNode root) {
	        Stack<TreeNode> path = new Stack<TreeNode>();
	        List<Integer> preOrderSeq = new LinkedList<Integer>();
	    	TreeNode node = root;
	        while (!path.isEmpty() || null != node) {
		        while (null != node) {
		        	path.add(node);
		        	preOrderSeq.add(node.val);
		        	node = node.left;
		        }
		        if (!path.isEmpty()) { node = path.pop(); }
		        node = node.right;
	        }
	        return preOrderSeq;
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
		
		List<Integer> seq = new Binary_Tree_Preorder_Traversal_144().new Solution().preorderTraversal(root);
		System.out.println(seq.toString());
	}

}
