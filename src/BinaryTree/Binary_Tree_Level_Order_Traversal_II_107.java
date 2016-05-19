package BinaryTree;

import java.util.LinkedList;
import java.util.List;

import leetcode.util.TreeNode;

public class Binary_Tree_Level_Order_Traversal_II_107 {
	
	public class Solution {
	    public List<List<Integer>> levelOrderBottom(TreeNode root) {
	    	if (null == root) { return new LinkedList<List<Integer>>(); }
	    	
	    	LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
	    	List<Integer> list = new LinkedList<Integer>();
	    	LinkedList<List<Integer>> stack = new LinkedList<List<Integer>>();
	    	
	        queue.add(root);
	        int prev_level = 1, curr_level = 0;
	        while (!queue.isEmpty()) {
	        	TreeNode node = queue.removeFirst();	   
	        	list.add(node.val);
	        	if (null != node.left) { 
	        		queue.add(node.left);
	        		++ curr_level;
	        	}
	        	if (null != node.right) { 
	        		queue.add(node.right); 
	        		++ curr_level;
	        	}
	        	if (0 == -- prev_level) {
	        		prev_level = curr_level;
	        		curr_level = 0;
	        		stack.addFirst(list);
	        		list = new LinkedList<Integer>();
	        	}	        	
	        }
	        return stack;
	    }
	}

	public static void main(String[] args) {
	}

}
