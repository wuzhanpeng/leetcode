package LinkedList;

import leetcode.util.ListNode;

public class Reverse_Linked_List_II_92 {
	
	public class Solution {
	    public ListNode reverseBetween(ListNode head, int m, int n) {
	    	// Insert a head node
	    	ListNode ret = new ListNode(0);
	    	ret.next = head;
	        ListNode beg = ret, end = head, rHead = null, rTail = null;
	        for (int i = 1; i < m; ++ i) {
	        	beg = beg.next;
	        	end = end.next;
	        }
	        rTail = end;
	        for (int i = m; i <= n; ++ i) {
	        	ListNode tmp = end;
	        	end = end.next;
	        	tmp.next = rHead;
	        	rHead = tmp;
	        }
	        beg.next = rHead;
	        rTail.next = end;
	        return ret.next;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
