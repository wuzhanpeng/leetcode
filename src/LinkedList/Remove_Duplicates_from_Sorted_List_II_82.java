package LinkedList;

import leetcode.util.ListNode;

public class Remove_Duplicates_from_Sorted_List_II_82 {
	
	public class Solution {
	    public ListNode deleteDuplicates(ListNode head) {
	    	ListNode extra = new ListNode(0);
	    	extra.next = head;
	    	ListNode node = head, prev = extra;
	        while (null != node && null != node.next) {
	        	if (node.val == node.next.val) {
	        		int val = node.val;
	        		do {
						node = node.next;
					} while (null != node && node.val == val);
	        		if (null != node && null != node.next && 
	        				node.next.val == node.val) { continue; }
	        	}
	        	prev.next = node;
	        	prev = prev.next;
	        	if (null != node) { node = node.next; }
	        }
	        return extra.next;
	    }
	}

	public static void main(String[] args) {
		new Remove_Duplicates_from_Sorted_List_II_82().new Solution().deleteDuplicates(
				ListNode.init(new int[]{1,2}, 0));
	}

}
