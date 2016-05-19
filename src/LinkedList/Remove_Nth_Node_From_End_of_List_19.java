package LinkedList;

import leetcode.util.ListNode;

public class Remove_Nth_Node_From_End_of_List_19 {
	
	public class Solution {
	    public ListNode removeNthFromEnd(ListNode head, int n) {
	    	if (0 == n) { return head; }
	        ListNode node = head, remove = head;	        
	        for (int i = 0; i < n; ++ i) { node = node.next; }
	        if (null == node) { return head.next; }
	        node = node.next;
	        while (null != node) {
	        	node = node.next;
	        	remove = remove.next;
	        }
	        remove.next = remove.next.next;
	        return head;
	    }
	}

	public static void main(String[] args) {
		ListNode h1 = new ListNode(1);
		h1.next = new ListNode(2);
		h1.next.next = new ListNode(3);
		h1.next.next.next = new ListNode(4);
		h1.next.next.next.next = new ListNode(5);
		h1 = new Remove_Nth_Node_From_End_of_List_19().new Solution().removeNthFromEnd(h1, 0);
		while (h1 != null) { System.out.printf("->%d", h1.val); h1 = h1.next; }
	}

}
