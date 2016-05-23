package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import leetcode.util.TreeNode;

public class Binary_Tree_Right_Side_View_199 {
	
	public class Solution {
	    private List<Integer> view = new ArrayList<Integer>(100);
	    public List<Integer> rightSideView(TreeNode root) {
	    	dfs(root, 0);
	    	bfs(root);
	    	return view;
	    }
	    private void dfs(TreeNode node, int depth) {
			if (null == node) { return; }
			if(depth == view.size()) { view.add(node.val); }
			else { view.set(depth, node.val); }
			dfs(node.left, depth + 1);
			dfs(node.right, depth + 1);
		}
	    private void bfs(TreeNode root) {
			Queue<TreeNode> queue = new LinkedList<TreeNode>();
			if (null != root) { queue.add(root); }
			while (!queue.isEmpty()) {
				Queue<TreeNode> nextLevel = new LinkedList<TreeNode>();
				while (!queue.isEmpty()) {
					TreeNode node = queue.poll();
					if (queue.isEmpty()) { view.add(node.val); }
					if (null != node.left) { nextLevel.add(node.left); }
					if (null != node.right) { nextLevel.add(node.right); }
				}
				queue.addAll(nextLevel);
			}
		}
	}

	public static void main(String[] args) {
		new Binary_Tree_Right_Side_View_199().new Solution().rightSideView(null);
	}

}
