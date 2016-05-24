package BinaryTree;

import java.util.Stack;

import leetcode.util.TreeNode;

public class Binary_Search_Tree_Iterator_173 {
	
	// non-recursion in-order traversal
	public class BSTIterator {
		
		private Stack<TreeNode> path = new Stack<TreeNode>();
		private TreeNode idx = null;

	    public BSTIterator(TreeNode root) {
	        findLeftMost(root);
	    }

	    /** @return whether we have a next smallest number */
	    public boolean hasNext() {
	        return null != idx;
	    }

	    /** @return the next smallest number */
	    public int next() {
	    	int ret = idx.val;
	    	update();
	        return ret;
	    }
	    
	    private void update() {
	    	if (null != idx.right) { findLeftMost(idx.right); }
	    	else {
	    		idx = path.pop();
				TreeNode parent = path.isEmpty() ? null : path.peek();
				while (!path.isEmpty() && idx == parent.right) {
					idx = path.pop();
					parent = path.isEmpty() ? null : path.peek();
				}
				idx = parent;
	    	}
		}
	    
	    private void findLeftMost(TreeNode node) {
			while (null != node) {
				path.add(node);
				idx = node;
				node = node.left;
			}
		}
	}

	public static void main(String[] args) {
		new Binary_Search_Tree_Iterator_173().new BSTIterator(new TreeNode(1));
	}

}
