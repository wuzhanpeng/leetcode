package LinkedList;

import leetcode.util.ListNode;

public class Partition_List_86 {
	
	public class Solution {
	    public ListNode partition(ListNode head, int x) {
	    	if (null == head) { return null; }
	        ListNode mHead = head, less = null;
	        if (head.val >= x) {
	        	while (null != head.next && head.next.val >= x) {
	        		head = head.next;
	        	}
	        	if (null == head.next) { return mHead; }
				ListNode tmp = head.next;
				head.next = head.next.next;
				tmp.next = mHead;
				mHead = tmp;
				less = mHead;
	        } else {
	        	while (null != head.next && head.next.val < x) {
	        		head = head.next;
	        	}
				less = head;
			}
	        while (null != head.next) {
	        	if (head.next.val < x) {
	        		ListNode tmp = head.next;
					head.next = head.next.next;
					tmp.next = less.next;
					less.next = tmp;
					less = less.next;
	        	} else {					
	        		head = head.next;
				}
	        }
	        return mHead;
	    }
	}

	public static void main(String[] args) {
		ListNode.print(new Partition_List_86().new Solution().partition(ListNode.init(new int[]{1,1}, 0), 2));
//		ListNode.print(new Partition_List_86().new Solution().partition(ListNode.init(new int[]{1,2,3}, 0), 0));
//		ListNode.print(new Partition_List_86().new Solution().partition(ListNode.init(new int[]{1}, 0), 0));
		
//		ListNode.print(new Partition_List_86().new Solution().partition(ListNode.init(new int[]{1,4,3,2,5,2}, 0), 3));
//		ListNode.print(new Partition_List_86().new Solution().partition(ListNode.init(new int[]{1,3,-1,5,2,1}, 0), 3));
		
	}

}
