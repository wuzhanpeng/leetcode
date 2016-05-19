package DynamicProgramming;

public class Climbing_Stairs_70 {
	
	public class Solution {
	    public int climbStairs(int n) {
	        int[] ways = new int[50];
	        ways[0] = 0; ways[1] = 1; ways[2] = 2;
	        for (int i = 3; i <= n; ++ i) {
	        	ways[i] = ways[i - 1] + ways[i - 2];
	        }
	        return ways[n];
	    }
	}

	public static void main(String[] args) {
		System.out.println(new Climbing_Stairs_70().new Solution().climbStairs(20));
	}

}
