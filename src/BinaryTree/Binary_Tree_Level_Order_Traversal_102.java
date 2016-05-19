package BinaryTree;

import java.util.LinkedList;
import java.util.List;

import leetcode.util.TreeNode;

public class Binary_Tree_Level_Order_Traversal_102 {
	
	public class Solution {
	    public List<List<Integer>> levelOrder(TreeNode root) {
	    	if (null == root) { return new LinkedList<List<Integer>>(); }
	        LinkedList<TreeNode> queue = new LinkedList<>();
	        LinkedList<List<Integer>> tree = new LinkedList<List<Integer>>();
	        LinkedList<Integer> level = new LinkedList<Integer>();
	        queue.add(root);
	        
	        int prev = 1, curr = 0;
	        while (!queue.isEmpty()) {
	        	TreeNode node = queue.removeFirst();
	        	level.add(node.val); -- prev;
	        	if (null != node.left) { queue.add(node.left); ++ curr; }
	        	if (null != node.right) { queue.add(node.right); ++ curr; }
	        	if (0 == prev) {
	        		prev = curr; curr = 0;
	        		tree.add(level);
	        		level = new LinkedList<Integer>();
	        	}
	        }
	        return tree;
	    }
	}

	public static void main(String[] args) {
	}

}
