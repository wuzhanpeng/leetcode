package BinaryTree;

import java.util.HashMap;

import leetcode.util.TreeNode;

public class Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal_106 {
	
	public class Solution {
		private HashMap<Integer, Integer> map = new HashMap<>();
		private int idx = 0;
	    public TreeNode buildTree(int[] inorder, int[] postorder) {
	    	if (null == postorder || 0 == postorder.length) { return null; }
	        // Map
	    	for (int i = 0; i < inorder.length; ++ i) {
	    		map.put(inorder[i], i);
	    	}
	    	idx = inorder.length - 1;
	    	return construct(postorder, 0, postorder.length - 1);
	    }
	    private TreeNode construct(int[] postorder, int beg, int end) {
			if (beg > end) { ++ idx; return null; }
			TreeNode node = new TreeNode(postorder[idx]);
			int pos = map.get(postorder[idx]);
			-- idx;
			node.right = construct(postorder, pos + 1, end);
			-- idx;
			node.left = construct(postorder, beg, pos - 1);
			return node;
		}
	}

	public static void main(String[] args) {
		new Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal_106()
		.new Solution().buildTree(new int[]{2,4,1,5,3}, new int[]{4,2,5,3,1});
	}

}
