package BinaryTree;

import leetcode.util.TreeNode;

public class Convert_Sorted_Array_to_Binary_Search_Tree_108 {
	
	public class Solution {
	    public TreeNode sortedArrayToBST(int[] nums) {
	    	if (null == nums || 0 == nums.length) { return null; }
	    	return dfsCreateBST(nums, 0, nums.length);	        
	    }
	    private TreeNode dfsCreateBST(int[] nums, int l, int r) {
			if (l >= r) { return null; }
			int mid = (l + r) / 2;
			TreeNode node = new TreeNode(nums[mid]);
			node.left = dfsCreateBST(nums, l, mid);
			node.right = dfsCreateBST(nums, mid + 1, r);
			return node;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
