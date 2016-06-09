package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triangle_120 {
	
	public class Solution {
	    public int minimumTotal(List<List<Integer>> triangle) {
	    	int min = 0, size = triangle.size();
	    	if (1 == size) { return triangle.get(0).get(0); }
	        for (int row = 1; row < size; ++ row) {
	        	triangle.get(row).set(0, triangle.get(row - 1).get(0) + triangle.get(row).get(0));
	        	min = triangle.get(row).get(0);
	        	for (int col = 1; col < row; ++ col) {
	        		triangle.get(row).set(col, 
	        				Math.min(triangle.get(row - 1).get(col - 1), 
	        						 triangle.get(row - 1).get(col)) + triangle.get(row).get(col));
	        		min = Math.min(min, triangle.get(row).get(col));
	        	}
	        	triangle.get(row).set(row, triangle.get(row - 1).get(row - 1) + triangle.get(row).get(row));
	        }
	        return Math.min(min, triangle.get(size - 1).get(size - 1));
	    }
	}

	public static void main(String[] args) {
		List<List<Integer>> m = new ArrayList<>();
		m.add(Arrays.asList(new Integer[]{-1}));
		m.add(Arrays.asList(new Integer[]{2,3}));
		m.add(Arrays.asList(new Integer[]{1,-1,-1}));
		new Triangle_120().new Solution().minimumTotal(m);
	}

}
