package leetcode.util;

public class Debug {
	public static void printArray(int[] array) {
		if (null == array) { System.out.println("null"); }
		System.out.printf("[");
		for (int x : array) {
			System.out.printf(" %d", x);
		}
		System.out.println(" ]");
	}
}
