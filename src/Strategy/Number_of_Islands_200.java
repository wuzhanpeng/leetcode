package Strategy;

public class Number_of_Islands_200 {
	
	public class Solution {
	    public int numIslands(char[][] grid) {
	    	if (null == grid || 0 == grid.length || 0 == grid[0].length) { return 0; }
	    	int rows = grid.length, cols = grid[0].length;
	    	int[][] US = new int[rows][cols];
	    	int[] head = new int[10000];
	    	int ans = 0;
	    	if ('1' == grid[0][0]) { US[0][0] = ++ ans; }
	    	for (int i = 1; i < rows; ++ i) {
	    		if ('0' == grid[i][0]) { continue; }
	    		if ('1' == grid[i - 1][0]) { US[i][0] = US[i - 1][0]; }
	    		else { US[i][0] = ++ ans; }
	    	}
	    	for (int i = 1; i < cols; ++ i) {
	    		if ('0' == grid[0][i]) { continue; }
	    		if ('1' == grid[0][i - 1]) { US[0][i] = US[0][i - 1]; }
	    		else { US[0][i] = ++ ans; }
	    	}
	    	int seq = ans;
	        for (int i = 1; i < rows; ++ i) {
	        	for (int j = 1; j < cols; ++ j) {
	        		if ('0' == grid[i][j]) { continue; }
	        		if ('1' == grid[i][j - 1] && '1' == grid[i - 1][j]) {
	        			if (US[i][j - 1] != US[i - 1][j]) {
	        				int l = US[i][j - 1];
	        				int t = US[i - 1][j];
	        				while (0 != head[l]) { l = head[l]; }
	        				while (0 != head[t]) { t = head[t]; }
	        				if (t != l) {
	        					head[l] = t;
	        					-- ans;
	        				}
	        			}
	        			US[i][j] = US[i - 1][j];
	        		}
	        		else if ('0' == grid[i][j - 1] && '0' == grid[i - 1][j]) { ++ ans; US[i][j] = ++ seq; }
	        		else {
						if ('1' == grid[i][j - 1]) {
							US[i][j] = US[i][j - 1];
						} else if ('1' == grid[i - 1][j]) {
							US[i][j] = US[i - 1][j];
						}
					}
	        		
	        		// debug
	        		if (1 == ans) {
	        			System.out.printf("(%d, %d)\n", i, j);
	        		}
	        	}
	        }
	        return ans;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		11111011111111101011
//		01111111111110111110
//		10111001101111111111
//		11110111111111111111
//		10011111111111111111
//		10111111011101110111
//		01111111111101101111
//		11111111111101111011
//		11111111110111111111
//		11111111111111111111
		char[][] t = new char[][]{
			"11111011111111101011".toCharArray(),
			"01111111111110111110".toCharArray(),
			"10111001101111111111".toCharArray(),
			"11110111111111111111".toCharArray(),
			"10011111111111111111".toCharArray(),
			"10111111011101110111".toCharArray(),
			"01111111111101101111".toCharArray(),
			"11111111111101111011".toCharArray(),
			"11111111110111111111".toCharArray(),
			"11111111111111111111".toCharArray()};
		System.out.println(new Number_of_Islands_200().new Solution().numIslands(t));
	}

}
