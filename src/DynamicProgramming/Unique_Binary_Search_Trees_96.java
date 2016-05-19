package DynamicProgramming;

public class Unique_Binary_Search_Trees_96 {
	
	public class Solution {
		private int[] total = new int[50];
		private int size = 1;
		public Solution() { total[0] = 1; total[1] = 1; }
	    public int numTrees(int n) {
	    	if (n > size) { 
		        for (++ size; size <= n; ++ size) {
		        	int l_tree = 0;
		        	while (l_tree < size / 2) {
		        		total[size] += total[l_tree] * total[size - l_tree - 1];
//		        		 System.out.printf("size:%d, %d - l:%d, r:%d\n", size, total[size], total[l_tree], total[size - l_tree - 1]);
		        		 ++ l_tree;
		        	}
		        	total[size] *= 2;
		        	if (size % 2 == 1) {
		        		total[size] += total[l_tree] * total[l_tree];
		        	}
		        }
		        -- size;
	    	}
	        return total[n];
	    }
	}

	public static void main(String[] args) {
//		for (long i = 0, factorial = 1; factorial < Integer.MAX_VALUE; ++ i, factorial *= i) {
////			System.out.printf("%d! = %d\n", i, factorial);
//			System.out.printf("%d,", factorial);
//		}
		System.out.println(new Unique_Binary_Search_Trees_96().new Solution().numTrees(19));
	}

}
