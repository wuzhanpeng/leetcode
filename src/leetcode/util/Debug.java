package leetcode.util;

import java.util.Comparator;
import java.util.List;

public class Debug {
	public static void printArray(int[] array) {
		if (null == array) { System.out.println("null"); }
		System.out.printf("[");
		for (int x : array) {
			System.out.printf(" %d", x);
		}
		System.out.println(" ]");
	}
	public static void printArray(long[] array) {
		if (null == array) { System.out.println("null"); }
		System.out.printf("[");
		for (long x : array) {
			System.out.printf(" %d", x);
		}
		System.out.println(" ]");
	}
	public static void printArray(Integer[] array) {
		if (null == array) { System.out.println("null"); }
		System.out.printf("[");
		for (int x : array) {
			System.out.printf(" %d", x);
		}
		System.out.println(" ]");
	}
	public static void printArray(char[] array) {
		if (null == array) { System.out.println("null"); }
		System.out.printf("[");
		for (char x : array) {
			System.out.printf(" %c", x);
		}
		System.out.println(" ]");
	}
	public static <E> void printList(List<E> list) {
		if (null == list) { System.out.println("null"); }
		System.out.printf("[");
		for (E x : list) {
			System.out.printf(" %s", x);
		}
		System.out.println(" ]");
	}
	public static <E> void printLists(List<List<E>> lists) {
		if (null == lists) { System.out.println("null"); }
		System.out.printf("Size: %d\n", lists.size());
		lists.sort(new Comparator<List<E>>() {

			@Override
			public int compare(List<E> o1, List<E> o2) {
				return o1.size() - o2.size();
			}
		});
		for (List<E> list : lists) {
			System.out.printf("[");
			for (E x : list) {
				System.out.printf(" %s", x);
			}
			System.out.println(" ]");
		}
	}
	public static void printMatrix(int[][] matrix) {
		if (null == matrix) { System.out.println("null"); }
		for (int[] list : matrix) {
			printArray(list);
		}
	}
}
