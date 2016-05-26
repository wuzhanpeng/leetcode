package Math;

import java.util.Comparator;
import java.util.PriorityQueue;

import leetcode.util.Debug;

public class Super_Ugly_Number_313 {
	
	// for special case, n could not reach 10^6
	// such as 1800 [2,3,5]
	public class Solution {
		public class Prime {
			public int index;
			public int prime;
			public int val;
			public Prime(int index, int prime, int val) {
				this.index = index;
				this.prime = prime;
				this.val = val;
			}
		}
	    public int nthSuperUglyNumber(int n, int[] primes) {
	        int[] uglySeq = new int[n];
	        uglySeq[0] = 1;
	        PriorityQueue<Prime> queue = new PriorityQueue<>(new Comparator<Prime>() {

				@Override
				public int compare(Prime o1, Prime o2) {
					return o1.val - o2.val;
				}
			});
	        for (int i = 0; i < primes.length; ++ i) {
        		Prime prime = new Prime(0, primes[i], primes[i]);
        		queue.add(prime);
        	}
	        for (int idx = 1; idx < n; ++ idx) {
	        	do {					
		        	Prime prime = queue.poll();
		        	uglySeq[idx] = prime.val;
		        	prime.val = uglySeq[++ prime.index] * prime.prime;
		        	queue.add(prime);
				} while (uglySeq[idx] == queue.peek().val);
		        System.out.println(uglySeq[idx]);
	        }
	        
	        Debug.printArray(uglySeq);
	        System.out.println(uglySeq[n - 1]);
	        return (int) uglySeq[n - 1];
	    }
	}

	public static void main(String[] args) {
		new Super_Ugly_Number_313().new Solution().nthSuperUglyNumber(1800, new int[]{2,3,5});
	}

}
