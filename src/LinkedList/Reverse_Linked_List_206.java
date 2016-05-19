package LinkedList;

public class Reverse_Linked_List_206 {
	
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	public class Solution {
	    public ListNode reverseList(ListNode head) {
	        ListNode reverseHead = null;
	        while (null != head) {
	        	ListNode node = head;
	        	head = head.next;
	        	node.next = reverseHead;
	        	reverseHead = node;	        	
	        }
	        return reverseHead;
	    }
	}

	public static void main(String[] args) {
	}

}
