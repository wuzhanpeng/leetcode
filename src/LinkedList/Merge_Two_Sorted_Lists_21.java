package LinkedList;

import leetcode.util.ListNode;

public class Merge_Two_Sorted_Lists_21 {
	
	public class Solution {
	    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {	    	
	    	ListNode head = null, node = null, mNode = null;
	    	if (null != l1 && null != l2) { 
	    		if (l1.val < l2.val) { mNode = l1; l1 = l1.next; }
	    		else { mNode = l2; l2 = l2.next; }
	    		head = mNode; node = mNode;
	    	}	
	    	while (null != l1 && null != l2) {
	    		if (l1.val < l2.val) { mNode = l1; l1 = l1.next; }
	    		else { mNode = l2; l2 = l2.next; }
	    		node.next = mNode;
	    		node = node.next;
	    	}
	    	if (null != l1 || null != l2) { 
	    		if (null != node) { node.next = (null != l1) ? l1 : l2; }
	    		else { head = (null != l1) ? l1 : l2; }
	    	}
	    	return head;
	    }
	}

	public static void main(String[] args) {
		
		// build linked list
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(1);
		l1.next.next = new ListNode(2);

		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(1);
		l2.next.next = new ListNode(2);
		l2.next.next.next = new ListNode(3);
		l2.next.next.next.next = new ListNode(3);
		
		// test case
		// case1:
		ListNode h1 = new Merge_Two_Sorted_Lists_21().new Solution().mergeTwoLists(l1, l2);
		while (null != h1) { System.out.println(h1.val); h1 = h1.next; }
		System.out.println("---");
		
		// case2:
		ListNode h2 = new Merge_Two_Sorted_Lists_21().new Solution().mergeTwoLists(null, null);
		while (null != h2) { System.out.println(h2.val); h2 = h2.next; }
	}

}
