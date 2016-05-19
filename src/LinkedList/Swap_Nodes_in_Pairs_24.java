package LinkedList;

import leetcode.util.ListNode;

public class Swap_Nodes_in_Pairs_24 {
	
	public class Solution {
	    public ListNode swapPairs(ListNode head) {
	        ListNode node = head, prev_pair = null;
	        if (null != node && null != node.next) {
	        	head = node.next;
	        	node.next = head.next;
	        	head.next = node;
	        	prev_pair = node;
	        	node = node.next;
	        }
	        while (null != node) {
	        	if (null != node.next) {
	        		ListNode next = node.next;
	        		node.next = node.next.next;
	        		next.next = node;
	        		prev_pair.next = next;
	        		prev_pair = node;
	        	}
	        	node = node.next;
	        }
	        return head;
	    }
	}

	public static void main(String[] args) {
		// build linked list
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(3);
		l1.next.next.next = new ListNode(4);
		l1.next.next.next.next = new ListNode(5);
		
		ListNode h = new Swap_Nodes_in_Pairs_24().new Solution().swapPairs(l1);
		while (null != h) { System.out.println(h.val); h = h.next; }
	}

}
