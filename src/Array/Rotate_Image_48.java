package Array;

//import leetcode.util.Debug;

public class Rotate_Image_48 {
	
	public class Solution {
	    public void rotate(int[][] matrix) {
	    	int n = matrix.length, width = (n - 1) / 2, height = (n % 2 == 0) ? width : width - 1;
	        for (int i = 0; i <= width; ++ i) {
	        	for (int j = 0; j <= height; ++ j) {
	        		int prev = matrix[n - j - 1][i];
					for (int k = 0, row = i, col = j; k < 4; ++ k) {
						int tmp = matrix[row][col];
						matrix[row][col] = prev;
						prev = tmp;
						
						// debug
//						System.out.printf("(%d, %d)\n", row, col);
//						Debug.printMatrix(matrix);
						
						int r = col, c = n - row - 1;
						row = r; col = c;
					}
				}
	        }
	    }
	}

	public static void main(String[] args) {
//		new Rotate_Image_48().new Solution().rotate(new int[][]{{1,2},{3,4}});
		new Rotate_Image_48().new Solution().rotate(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
	}

}
