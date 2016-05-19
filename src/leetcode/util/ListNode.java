package leetcode.util;

public class ListNode {
	public int val;
	public ListNode next;
	public ListNode(int x) { val = x; }
	
	// Debug 
	public static ListNode init(int[] nums, int idx) {
		if (idx == nums.length) { return null; }
		ListNode node = new ListNode(nums[idx]);
		node.next = init(nums, idx + 1);
		return node;
	}
	public static void print(ListNode node) {
		boolean isEmpty = node == null;
		if (null != node) {
			System.out.printf("[%d", node.val);
			node = node.next;
		}
		while (null != node) {
			System.out.printf(" %d", node.val);
			node = node.next;
		}
		if (isEmpty) { System.out.println("null"); }
		else { System.out.println("]"); }
	}
}