package leetcode.util;

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
	public static <E> void printArray(List<E> list) {
		if (null == list) { System.out.println("null"); }
		System.out.printf("[");
		for (E x : list) {
			System.out.printf(" %s", x);
		}
		System.out.println(" ]");
	}
	public static void printMatrix(int[][] matrix) {
		if (null == matrix) { System.out.println("null"); }
		for (int[] list : matrix) {
			printArray(list);
		}
	}
}
