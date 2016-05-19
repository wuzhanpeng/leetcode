package BinaryTree;

public class Invert_Binary_Tree_226 {
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	
	public class Solution {
	    public TreeNode invertTree(TreeNode root) {	        
	    	if (null != root) {invert(root);}
	    	return root;
	    }
	    
	    private void invert(TreeNode root) {
	    	if (null != root.left) {invertTree(root.left);}
	        if (null != root.right) {invertTree(root.right);}
	        
	        TreeNode tmp = root.right;
	        root.right = root.left;
	        root.left = tmp;
		}
	}

	public static void main(String[] args) {

	}

}
