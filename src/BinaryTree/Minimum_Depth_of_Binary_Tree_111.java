package BinaryTree;

import leetcode.util.TreeNode;

public class Minimum_Depth_of_Binary_Tree_111 {
	
	public class Solution {
		private int minDepth = Integer.MAX_VALUE;
	    public int minDepth(TreeNode root) {
	    	if (null == root) { return 0; }
	    	findRecursion(root, 1);
	        return minDepth;
	    }
	    private void findRecursion(TreeNode tNode, int depth) {
			if (null == tNode || depth >= minDepth) { return; }
			if (null == tNode.left && null == tNode.right) {
				minDepth =  depth;
			}
			findRecursion(tNode.left, depth + 1);
			findRecursion(tNode.right, depth + 1);
		}
	}

	public static void main(String[] args) {
	}

}
