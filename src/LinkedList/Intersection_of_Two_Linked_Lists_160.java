package LinkedList;

import leetcode.util.ListNode;

public class Intersection_of_Two_Linked_Lists_160 {
	
	public class Solution {
	    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	    	if (null == headA || null == headB) { return null; }
	    	ListNode ha = headA, hb = headB;
	        while (ha != hb) {
	        	if (null == ha) { ha = headB; }
	        	else { ha = ha.next; }
	        	if (null == hb) { hb = headA; }
	        	else { hb = hb.next; }
	        }
	        return ha;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
