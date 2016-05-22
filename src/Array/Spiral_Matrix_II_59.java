package Array;

public class Spiral_Matrix_II_59 {
	
	public class Solution {
	    public int[][] generateMatrix(int n) {
	        int[][] matrix = new int[n][n];
	        int i = 1, depth = 0;
	        for (; depth < (n + 1) / 2; ++ depth) {
	        	int row = depth, col = depth;
	        	for (; col < n - depth - 1; ++ col) { matrix[row][col] = i ++; }
	        	for (; row < n - depth - 1; ++ row) { matrix[row][col] = i ++; }
	        	for (; col > depth; -- col) { matrix[row][col] = i ++; }
	        	for (; row > depth; -- row) { matrix[row][col] = i ++; }
	        }
	        if (n % 2 == 1) { matrix[n / 2][n / 2] = i; }
	        return matrix;
	    }
	}

	public static void main(String[] args) {
		int[][] m = new Spiral_Matrix_II_59().new Solution().generateMatrix(4);
		for (int i = 0; i < m.length; ++ i) {
			for (int j = 0; j < m[i].length; ++ j) {
				System.out.printf("%d ", m[i][j]);
			}
			System.out.println();
		}
	}

}
