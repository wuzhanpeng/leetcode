package Strategy;

public class Search_a_2D_Matrix_74 {
	
	public class Solution {
	    public boolean searchMatrix(int[][] matrix, int target) {
	    	int row = -1;
	        int t = 0, b = matrix.length - 1;
	        int l = 0, r = matrix[0].length - 1;
	        if (null == matrix || 0 == matrix[0].length ||
	        		target < matrix[t][l] || target > matrix[b][r]) { return false; }
	    	if (target >= matrix[t][l] && target <= matrix[t][r]) { row = 0; }
	    	else if (target >= matrix[b][l] && target <= matrix[b][r]) { row = b; }
	    	else {
		        while (t < b) {
		        	int mid = (t + b) / 2;
		        	if (target > matrix[mid][0]) { t = mid + 1; }
		        	else if (target < matrix[mid][0]) { b = mid; }
		        	else { return true; }
		        }
//		        System.out.println(t);
		        row = t - 1;
	    	}
	    	while (l < r) {
	    		int mid = (l + r) / 2;
	    		if (target > matrix[row][mid]) { l = mid + 1; }
	        	else if (target < matrix[row][mid]) { r = mid; }
	        	else { return true; }
	    	}
	        return (l == r && target == matrix[row][l]) ? true : false;
	    }
	}

	public static void main(String[] args) {

		new Search_a_2D_Matrix_74().new Solution().searchMatrix(new int[][]{{1},{3},{5}}, 2);
	}

}
