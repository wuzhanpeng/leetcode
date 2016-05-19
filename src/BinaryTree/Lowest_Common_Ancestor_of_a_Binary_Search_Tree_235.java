package BinaryTree;

import java.util.Stack;

import leetcode.util.TreeNode;

public class Lowest_Common_Ancestor_of_a_Binary_Search_Tree_235 {
	
	public class Solution {
		
		boolean hasP = false, hasQ = false;
		Stack<TreeNode> path = new Stack<TreeNode>();
		
	    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	    	search(root, p, q);
	    	return (null == root) ? null : path.peek();
	    }
	    
	    private void search(TreeNode node, TreeNode p, TreeNode q) {
			if (null == node) { return; }
			if (hasP == false && hasQ == false) { path.push(node); }
			if (node == p) { hasP = true; }
			if (node == q) { hasQ = true; }
			
			if (hasP == true && hasQ == true) { return; }
			else {
				search(node.left, p, q);
				search(node.right, p, q);
				if (path.peek() == node && (hasP == false || hasQ == false)) { path.pop(); }
			}
		}
	}

	public static void main(String[] args) {
		// build tree
		TreeNode root = new TreeNode(6);
		root.left = new TreeNode(2); root.right = new TreeNode(8);
		root.left.left = new TreeNode(0); root.left.right = new TreeNode(4);
		root.left.right.left = new TreeNode(3); root.left.right.right = new TreeNode(5);
		root.right.left = new TreeNode(7); root.right.right = new TreeNode(9);
		
		// test case
		// case 1:
		TreeNode p1 = root.left, q1 = root.right; 
		System.out.println(new Lowest_Common_Ancestor_of_a_Binary_Search_Tree_235()
				.new Solution().lowestCommonAncestor(root, p1, q1).val);
		
		// case 2:
		TreeNode p2 = root.left, q2 = p2.right;
		System.out.println(new Lowest_Common_Ancestor_of_a_Binary_Search_Tree_235()
				.new Solution().lowestCommonAncestor(root, p2, q2).val);
	}

}
