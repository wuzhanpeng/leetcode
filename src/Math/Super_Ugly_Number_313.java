package Math;

import java.util.PriorityQueue;

import leetcode.util.Debug;

public class Super_Ugly_Number_313 {
	
	public class Solution {
	    public int nthSuperUglyNumber(int n, int[] primes) {
	        long[] uglySeq = new long[n];
	        uglySeq[0] = 1;
	        int idx = 1;
	        PriorityQueue<Long> queue = new PriorityQueue<Long>();
	        for (int prime : primes) { queue.add((long) prime); }
	        while (idx < n) {
	        	long min = queue.poll();
	        	if (min == uglySeq[idx - 1]) { continue; }
	        	uglySeq[idx ++] = (int) min;
	        	for (int i = 0; i < primes.length; ++ i) {
	        		if (min * primes[i] <= 0) { break; } 
	        		queue.add(min * primes[i]);
	        	}
	        }
	        Debug.printArray(uglySeq);
	        System.out.println(uglySeq[n - 1]);
	        return (int) uglySeq[n - 1];
	    }
	}

	public static void main(String[] args) {
		new Super_Ugly_Number_313().new Solution().nthSuperUglyNumber(3500, new int[]{2,3,5});
	}

}
