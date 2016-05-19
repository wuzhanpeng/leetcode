package LinkedList;

import leetcode.util.ListNode;

public class Remove_Duplicates_from_Sorted_List_83 {
	
	public class Solution {
	    public ListNode deleteDuplicates(ListNode head) {
	    	ListNode node = head, prev_node = head;
	    	if (null != node) {
	    		node = node.next;
	    	}
	        while (null != node) {
	        	if (prev_node.val == node.val) {
	        		prev_node.next = node.next;
	        	} else { prev_node = prev_node.next; }
	        	node = node.next;
	        }
	        return head;
	    }
	}

	public static void main(String[] args) {
		// build linked list
		ListNode h1 = new ListNode(1);
		h1.next = new ListNode(1);
		h1.next.next = new ListNode(2);
		
		ListNode h2 = new ListNode(1);
		h2.next = new ListNode(1);
		h2.next.next = new ListNode(2);
		h2.next.next.next = new ListNode(3);
		h2.next.next.next.next = new ListNode(3);
		
		// test case
		// case1:
		h1 = new Remove_Duplicates_from_Sorted_List_83().new Solution().deleteDuplicates(h1);
		while (null != h1) { System.out.println(h1.val); h1 = h1.next; }
		
		// case2:
		h2 = new Remove_Duplicates_from_Sorted_List_83().new Solution().deleteDuplicates(h2);
		while (null != h2) { System.out.println(h2.val); h2 = h2.next; }
		
		// case3:
		ListNode h3 = new Remove_Duplicates_from_Sorted_List_83().new Solution().deleteDuplicates(null);
		while (null != h3) { System.out.println(h3.val); h3 = h3.next; }
	}

}
