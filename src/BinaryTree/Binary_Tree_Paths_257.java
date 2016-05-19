package BinaryTree;

import java.util.LinkedList;
import java.util.List;

import leetcode.util.TreeNode;

public class Binary_Tree_Paths_257 {
	
	public class Solution {
	    private List<String> paths = new LinkedList<String>();
		private void traverse(TreeNode node, StringBuilder path) {
			int idx = path.length();
			path.append("->" + node.val);
			if (null == node.left && null == node.right) { paths.add(path.toString()); }
			if (null != node.left) { traverse(node.left, path); }
			if (null != node.right) { traverse(node.right, path); }
			path.delete(idx, path.length());
		}
	    public List<String> binaryTreePaths(TreeNode root) {
	        paths.clear();
	        if (null != root) {
	        	StringBuilder path = new StringBuilder(String.valueOf(root.val));
	        	if (null == root.left && null == root.right) { paths.add(path.toString()); }
				if (null != root.left) { traverse(root.left, path); }
				if (null != root.right) { traverse(root.right, path); }
	        }
			return paths;
	    }
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2); root.right = new TreeNode(3);
		root.left.right = new TreeNode(5);
		List<String> paths = new Binary_Tree_Paths_257().new Solution().binaryTreePaths(root);
		for (String path : paths) {
			System.out.println(path);
		}
	}

}
