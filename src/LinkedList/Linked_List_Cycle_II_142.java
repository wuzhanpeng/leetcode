package LinkedList;

import leetcode.util.ListNode;

public class Linked_List_Cycle_II_142 {
	
	/**
	 * Assume that: 1. total length is L
	 * 				2. start point to cycle beginning point is x
	 * 				3. cycle point to meet point is a
	 * 				4. fast_step - slow_step = s
	 * 			that: 
	 * 				s = nr (n cycles)
	 * 				s = x + a = nr = (n - 1)r + L - x
	 * 			conclusion:
	 * 				L - a - x + (n - 1)r = x
	 * it means, start from the meet point and list beginning point at the same time
	 * and they must meet at the cycle beginning.
	 * */
	public class Solution {
	    public ListNode detectCycle(ListNode head) {
	    	if (null == head || null == head.next) { return null; }
	        ListNode fast = head, slow = head;
	        while (null != fast && null != fast.next) {
	        	fast = fast.next.next;
	        	slow = slow.next;
	        	if (fast == slow) {
	        		ListNode ans = head;
		        	while (ans != slow) {
		        		ans = ans.next;
		        		slow = slow.next;
		        	}
		        	return ans;
	        	}
	        }
	        return null;
	    }
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(3);
		head.next = new ListNode(2);
		head.next.next = new ListNode(0);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = head.next;
		System.out.println(new Linked_List_Cycle_II_142().new Solution().detectCycle(head).val);
	}

}
