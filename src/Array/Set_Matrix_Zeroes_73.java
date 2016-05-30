package Array;

public class Set_Matrix_Zeroes_73 {
	
	public class Solution {
	    public void setZeroes(int[][] matrix) {
	        boolean first_row = false, first_col = false;
	        for (int i = 0; i < matrix.length; ++ i) {
	        	for (int j = 0; j < matrix[0].length; ++ j) {
	        		if (0 == matrix[i][j]) {
	        			if (0 == i) { first_row = true; } else { matrix[i][0] = 0; }
	        			if (0 == j) { first_col = true; } else { matrix[0][j] = 0; }
	        		}
	        	}
	        }
	        for (int i = 1; i < matrix[0].length; ++ i) { if(0 == matrix[0][i]) { setZero(matrix, i, false); } }
	        for (int i = 1; i < matrix.length; ++ i) { if (0 == matrix[i][0]) { setZero(matrix, i, true); } }
	        if (first_row) { setZero(matrix, 0, true); }
	        if (first_col) { setZero(matrix, 0, false); }
		}
	    private void setZero(int[][] matrix, int ord, boolean isRow) {
			if (isRow) { for (int i = matrix[0].length - 1; i >= 0; -- i) { matrix[ord][i] = 0; } }
			else { for (int i = matrix.length - 1; i >= 0; -- i) { matrix[i][ord] = 0; } }
			
		}
	}

	public static void main(String[] args) {
		new Set_Matrix_Zeroes_73().new Solution().setZeroes(new int[][]{{0,0,0,5},{4,3,1,4},{0,1,1,4},{1,2,1,3},{0,0,1,1}});
	}

}
