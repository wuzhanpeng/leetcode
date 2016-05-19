package Set;

import java.util.HashSet;

public class Happy_Number_220 {
	
	public class Solution {
		
		private int[] getNums(int n) {
			int[] nums = new int[10];
			for (int i = 0; 0 != n; ++ i) {
				nums[i] = n%10;
				n /= 10;
			}
			return nums;
		}
		
	    public boolean isHappy(int n) {
	        HashSet<Integer> set = new HashSet<Integer>();
	        while (1 != n) {
	        	// debug
	        	// System.out.println(n);
	        	
	        	if (set.contains(n)) { return false; }
	        	else { set.add(n); }
	        	int sum = 0; 
	        	for (int i : getNums(n)) { sum += i*i; }
	        	n = sum;
	        }
	        return true;
	    }
	}

	public static void main(String[] args) {
		
		System.out.println(new Happy_Number_220().new Solution().isHappy(19));
	}

}
