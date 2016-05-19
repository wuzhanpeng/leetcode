package LinkedList;

import leetcode.util.ListNode;

public class Remove_Linked_List_Elements_203 {
	
	public class Solution {
	    public ListNode removeElements(ListNode head, int val) {
	    	while (null != head && head.val == val) { head = head.next; }
	    	if (null == head) { return null; }
	    	ListNode node = head;
	    	if (null != node.next) {
		    	while (null != node.next) {
		    		if (node.next.val == val) {
		    			node.next = node.next.next;
		    		} else {
						node = node.next;
					}
		    	}
	    	}
	        return head;
	    }
	}

	public static void main(String[] args) {

	}

}
