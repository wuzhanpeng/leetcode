package BinaryTree;
import java.util.HashMap;

import leetcode.util.TreeNode;

public class Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal_105 {
	
	public class Solution {
		private HashMap<Integer, Integer> map = new HashMap<>();
		private int idx = 0;
	    public TreeNode buildTree(int[] preorder, int[] inorder) {
	    	if (null == preorder || 0 == preorder.length) { return null; }
	        // Map
	    	for (int i = 0; i < inorder.length; ++ i) {
	    		map.put(inorder[i], i);
	    	}
	    	return construct(preorder, 0, preorder.length - 1);
	    }
	    private TreeNode construct(int[] preorder, int beg, int end) {
			if (beg > end) { -- idx; return null; }
			TreeNode node = new TreeNode(preorder[idx]);
			int pos = map.get(preorder[idx]);
			++ idx;
			node.left = construct(preorder, beg, pos - 1);
			++ idx;
			node.right = construct(preorder, pos + 1, end);
			return node;
		}
	}

	public static void main(String[] args) {
		new Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal_105()
		.new Solution().buildTree(new int[]{1,2,4,3,5}, new int[]{2,4,1,5,3});
	}

}
