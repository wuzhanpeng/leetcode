package DynamicProgramming;

public class Perfect_Squares_279 {
	
	public class Solution {
	    public int numSquares(int n) {
	    	int[] aux = new int[n + 1];
	    	aux[1] = 1;
	    	for (int i = 2; i <= n; ++ i) {
	    		int minNum = Integer.MAX_VALUE;
	    		int maxSquare = (int) Math.sqrt(i);
	    		if (0 == i - maxSquare * maxSquare) { minNum = 1; }
	    		else {
	    			for (int j = 1; j * j < i; ++ j) {
	    				minNum = Math.min(minNum, aux[i - j * j] + 1);
	    			}
	    		}
	    		aux[i] = minNum;
	    	}
	    	return aux[n];
	    }
	}

	public static void main(String[] args) {
		System.out.println(new Perfect_Squares_279().new Solution().numSquares(12));
//		for (int i = 1, cnt = 1; i * i <= Integer.MAX_VALUE && i * i > 0; ++ i, ++ cnt) {
////			if (cnt % 100 == 0) System.out.println();
//			System.out.printf("%d, ", i * i);
//		}
	}

}
