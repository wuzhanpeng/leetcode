package Strategy;

public class Search_a_2D_Matrix_II_240 {
	
	public class Solution {
	    public boolean searchMatrix(int[][] matrix, int target) {
	    	// less than the minimum
    		if (matrix[0][0] > target) { return false; }
    		int height = matrix.length, width = matrix[0].length;
	    	int left = 0, right = width - 1;
	    	int top = 0, bottom = height - 1;
	    	while (left < right && top < bottom) {
	    		int mid = (left + right) / 2;
	    		int cen = (top + bottom) / 2;
	    		if (matrix[cen][mid] > target) {
	    			right = mid;
	    			bottom = cen;
	    		} else if (matrix[cen][mid] < target) {
					left = mid + 1;
					top = cen + 1;
				} else {
					return true;
				}
	    	}
	    	while (left < width || top < height) {
	    		int l = Math.min(left, width - 1), t = Math.min(top, height - 1);
	    		if (top < height && matrix[top][0] <= target) {
	    			if (searchRowOrCol(matrix, 0, l, target, true, top)) { return true; }
	    			else { ++ top; }
	    		} else { top = height; }
	    		if (left < width && matrix[0][left] <= target) {
	    			if (searchRowOrCol(matrix, 0, t, target, false, left)) { return true; }
	    			else { ++ left; }
	    		} else { left = width; }
	    	}
	    	return false;
	    }
	    public boolean searchRowOrCol(int[][] matrix, int l, int r, int target, boolean searchRow, int ord) {
			while (l < r) {
				int mid = (l + r) / 2;
				int num = searchRow ? matrix[ord][mid] : matrix[mid][ord];
				if (target < num) { r = mid; }
				else if (target > num) { l = mid + 1; }
				else { return true; }
			}
	    	if (l == r) { return target == (searchRow ? matrix[ord][l] : matrix[l][ord]); }
			return false;
		}
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(new Search_a_2D_Matrix_II_240().new Solution().getFirstIndex(0, 4, -1, new int[]{0,1,3,4,8}));
//		int[][] m = new int[][]{{1,2},{3,4}};
//		System.out.println(new Search_a_2D_Matrix_II_240().new Solution().searchMatrix(new int[][]{{5},{6}}, 6));
		System.out.println(new Search_a_2D_Matrix_II_240().new Solution().searchMatrix(new int[][]{{1,4},{2,5}}, 5));
//		System.out.println(new Search_a_2D_Matrix_II_240().new Solution().searchMatrix(new int[][]{{1,4},{2,5}}, 2));
//		System.out.println(new Search_a_2D_Matrix_II_240().new Solution().searchMatrix(new int[][]
//				{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}}, 19));
//		System.out.println(new Search_a_2D_Matrix_II_240().new Solution().searchMatrix(new int[][]{{-1,3}}, 1));
//		System.out.println(new Search_a_2D_Matrix_II_240().new Solution().searchMatrix(new int[][]{{1,4},{2,5}}, 3));
//		System.out.println(new Search_a_2D_Matrix_II_240().new Solution().searchRowOrCol(new int[][]
//				{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}}, 0, 4, 16, false, 0));
	}

}
