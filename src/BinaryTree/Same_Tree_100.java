package BinaryTree;

public class Same_Tree_100 {
	
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}

	public class Solution {
		
		public boolean isSameTree(TreeNode p, TreeNode q) {
			if ((null == p && null != q) || 
			    (null != p && null == q)) { return false; }
			return (null != p ? (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right) : true);
		}
	}

	public static void main(String[] args) {
	}

}
