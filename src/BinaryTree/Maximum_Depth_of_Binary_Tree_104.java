package BinaryTree;

public class Maximum_Depth_of_Binary_Tree_104 {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	
	public class Solution {
	    public int maxDepth(TreeNode root) {
	        if (null == root) return 0;
	        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
	    }
	}

	public static void main(String[] args) {
	}

}
