package BinaryTree;

import leetcode.util.TreeNode;

public class Sum_Root_to_Leaf_Numbers_129 {
	
	public class Solution {
		private StringBuffer seq = new StringBuffer();
	    public int sumNumbers(TreeNode root) {
			if (null == root) return 0;
			return dfs(root);
	    }
	    private int dfs(TreeNode node) {
	    	seq.append(Character.forDigit(node.val, 10));
	    	int sum = 0;
	    	if (null == node.left && null == node.right) {
				sum = Integer.parseInt(seq.toString());
			}
	    	if (null != node.left) { sum += dfs(node.left); }
	    	if (null != node.right) { sum += dfs(node.right); }
	    	seq.deleteCharAt(seq.length() - 1);
	    	return sum;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(Integer.parseInt("0123"));
		TreeNode root = new TreeNode(0);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		System.out.println(new Sum_Root_to_Leaf_Numbers_129().new Solution().sumNumbers(root));
	}

}
