package LinkedList;

import leetcode.util.ListNode;

public class Odd_Even_Linked_List_328 {
	
	public class Solution {
	    public ListNode oddEvenList(ListNode head) {
	    	if (null == head) { return null; }
	        ListNode odd = null, even = null;
	        if (head != null) { odd = head; head = head.next; }
	        if (head != null) { even = head; head = head.next; }
	        ListNode m_odd = odd, m_even = even;
	        while (head != null) {
	        	if (head != null) { m_odd.next = head; head = head.next; m_odd = m_odd.next; }
		        if (head != null) { m_even.next = head; head = head.next; m_even = m_even.next; }
	        }
	        if (null != m_odd) { m_odd.next = null; }
	        if (null != m_even) { m_even.next = null; }
	        m_odd.next = even;
	        return odd;
	    }
	}

	public static void main(String[] args) {
		ListNode listNode = ListNode.init(new int[]{1,2,3,4}, 0);		
		ListNode.print(new Odd_Even_Linked_List_328().new Solution().oddEvenList(listNode));
	}

}
