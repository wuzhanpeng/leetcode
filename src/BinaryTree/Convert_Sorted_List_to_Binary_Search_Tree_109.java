package BinaryTree;

import leetcode.util.ListNode;
import leetcode.util.TreeNode;

public class Convert_Sorted_List_to_Binary_Search_Tree_109 {
	
	public class Solution {
	    public TreeNode sortedListToBST(ListNode head) {
	        int[] list = new int[100000];
	        int len = 0;
	        for (; null != head; ++ len, head = head.next) { list[len] = head.val; }
	        return createTree(list, 0, len);
	    }
	    private TreeNode createTree(int[] list, int l, int r) {
	    	if (l == r) { return null; }
			int mid = (l + r) / 2;
			TreeNode node = new TreeNode(list[mid]);
			node.left = createTree(list, l, mid);
			node.right = createTree(list, mid + 1, r);
			return node;
		}
	}

	public static void main(String[] args) {
		new Convert_Sorted_List_to_Binary_Search_Tree_109().new Solution().sortedListToBST(
				ListNode.init(new int[]{1,2,3,4,5}, 0));
	}

}
