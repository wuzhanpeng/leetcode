package LinkedList;

import leetcode.util.ListNode;

public class Palindrome_Linked_List_234 {
	
	// note: O(n) time and O(1) space
	public class Solution {
		private ListNode step, end;
		private boolean flag = true;
		private void determine(ListNode node) {
			if (null == node) { return; }
			determine(node.next);
			if (step == end) { return; }
			if (step.val != node.val) {
				flag = false;
			}
			step = step.next;
		}
	    public boolean isPalindrome(ListNode head) {
	        // find the middle node
	    	ListNode fast = head, slow = head;
	    	while (null != fast) {
	    		if (null == fast.next) { break; }
	    		fast = fast.next.next;
	    		slow = slow.next;
	    	}
	    	this.step = head; this.end = slow;
	    	// reverse & determine
	    	determine(slow);
	    	return this.flag;
	    }
	}

	public static void main(String[] args) {
		//1
		ListNode h1 = new ListNode(1);
		h1.next = new ListNode(2);
		h1.next.next = new ListNode(1);
		h1.next.next.next = new ListNode(2);
		h1.next.next.next.next = new ListNode(1);
		//2
		ListNode h2 = new ListNode(1);
		h2.next = new ListNode(2);
		h2.next.next = new ListNode(2);
		h2.next.next.next = new ListNode(1);
		//3
		ListNode h3 = new ListNode(1);
		h3.next = new ListNode(2);
		//4
		ListNode h4 = null;
		System.out.println(new Palindrome_Linked_List_234().new Solution().isPalindrome(h1));
		System.out.println(new Palindrome_Linked_List_234().new Solution().isPalindrome(h2));
		System.out.println(new Palindrome_Linked_List_234().new Solution().isPalindrome(h3));
		System.out.println(new Palindrome_Linked_List_234().new Solution().isPalindrome(h4));
	}

}
