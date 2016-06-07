package leetcode.util;

public class TreeNode {
	public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x) { val = x; }
    
    public static TreeNode getRoot1() {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.right.left = new TreeNode(5);
		return root;
	}
}