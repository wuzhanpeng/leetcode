package LinkedList;

import leetcode.util.ListNode;

public class Linked_List_Cycle_141 {
	
	public class Solution {
	    public boolean hasCycle(ListNode head) {
	    	if (null == head) { return false; }
	    	ListNode second = null;
	    	if (null != head.next) { second = head.next; }
	        while (null != second) {
	        	if (head == second) { return true; }
	        	if (null != second.next) {
	        		if (head == second.next) { return true; }
	        		second = second.next.next;
	        	} else {
	        		second = second.next;
	        	}
	        	head = head.next;
	        }
	        return false;
	    }
	}

	public static void main(String[] args) {
		ListNode l = new ListNode(1);
		l.next = new ListNode(2);
		System.out.println(new Linked_List_Cycle_141().new Solution().hasCycle(l));
	}

}
