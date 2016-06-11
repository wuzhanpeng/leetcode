package LinkedList;

import leetcode.util.ListNode;

public class Insertion_Sort_List_147 {
	
	public class Solution {
	    public ListNode insertionSortList(ListNode head) {
	    	if (null == head) { return null; }
	    	ListNode mHead = head;
	    	head = head.next;
	    	mHead.next = null;
	        while (null != head) {
	        	ListNode node = head;
	        	head = head.next;
	        	if (node.val < mHead.val) {
	        		node.next = mHead;
	        		mHead = node;
	        	} else {
	        		ListNode tmp = mHead;
					while (null != tmp.next && tmp.next.val < node.val) {
						tmp = tmp.next;
					}
					node.next = tmp.next;
					tmp.next = node;
				}
	        }
	        return mHead;
	    }
	}

	public static void main(String[] args) {
		new Insertion_Sort_List_147().new Solution().insertionSortList(ListNode.init(new int[]{1,2,3}, 0));
	}

}
