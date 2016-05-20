package DynamicProgramming;

public class Unique_Paths_62 {
	
	public class Solution {
//	    private int[][] dp = new int[100][100];
//	    public Solution() {
//	    	for (int i = 0; i < 100; ++ i) { 
//	    		dp[i][0] = 1;
//	    		dp[0][i] = 1;
//	    	}
//	    	for (int i = 1; i < 100; ++ i) {
//	    		for (int j = 1; j < 100; ++ j) {
//	    			dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
//	    		}
//	    	}
//		}
//	    public int uniquePaths(int m, int n) {
//	    	return dp[m - 1][n - 1];
//	    }
		
		public int uniquePaths(int m, int n) {
			int[][] dp = new int[m][n];
			for (int i = m - 1; i >= 0; -- i) { dp[i][0] = 1; }
			for (int i = n - 1; i >= 0; -- i) { dp[0][i] = 1; }
			for (int i = 1; i < m; ++ i) {
	    		for (int j = 1; j < n; ++ j) {
	    			dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
	    		}
	    	}
			return dp[m - 1][n - 1];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
