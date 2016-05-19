package LinkedList;

/** Write a function to delete a node (<b>except the tail</b>) */
public class Delete_Node_in_a_Linked_List_237 {
	
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	public class Solution {
	    public void deleteNode(ListNode node) {
	        ListNode next = node.next;
	        node.val = next.val;
	        node.next = next.next;
	    }
	}

	public static void main(String[] args) {
	}

}
