package Greedy;

public class Gas_Station_134 {
	
//	TLE
//	public class Solution {
//	    public int canCompleteCircuit(int[] gas, int[] cost) {
//	        int len = gas.length;
//	        for (int ans = 0; ans < len; ++ ans) {
//	        	if (gas[ans] < cost[ans]) { continue; }
//	        	int stock = 0;
//	        	int i = ans, cnt = 0;
//		        for (; cnt < len; ++ cnt, ++ i) {
//		        	if (i == len) { i %= len; }
//		        	if (gas[i] + stock < cost[i]) { break; }
//		        	stock += gas[i] - cost[i];
//		        }
//		        if (cnt == len) { return ans; }
//	        }
//	        return -1;
//	    }
//	}
	
	public class Solution {
	    public int canCompleteCircuit(int[] gas, int[] cost) {
	        int len = gas.length, sum = 0;
	        int[] aux = new int[len];
	        for (int i = 0; i < len; ++ i) {
	        	aux[i] = gas[i] - cost[i];
	        	sum += aux[i];
	        }
	        if (sum < 0) { return -1; }
	        int ans = 0; sum = 0;
	        for (int i = 0; i < len; ++ i) {
	        	sum += aux[i];
	        	if (sum < 0) {
	        		ans = i + 1;
	        		sum = 0;
	        	}
	        }
	        return ans;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Gas_Station_134().new Solution().canCompleteCircuit(new int[]{1,2}, new int[]{2,1});
	}

}
