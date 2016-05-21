package String;

import java.util.ArrayList;
import java.util.List;

//import leetcode.util.Debug;

/** https://leetcode.com/discuss/97307/java-simple-solution-beats-95%25 */
public class Different_Ways_to_Add_Parentheses_241 {
	
	public class Solution {
	    public List<Integer> diffWaysToCompute(String input) {
	    	int len = input.length(), p_idx = 0;
	    	List<Integer> nums = new ArrayList<Integer>();
	    	List<Character> opts = new ArrayList<Character>();
	    	for (int i = 0; i < len; ++ i) {
	    		char ch = input.charAt(i);
	    		if (ch == '+' || ch == '-' || ch == '*') {
	    			opts.add(ch);
	    			nums.add(Integer.parseInt(input.substring(p_idx, i)));
	    			p_idx = i + 1;
	    		}
	    	}
	    	nums.add(Integer.parseInt(input.substring(p_idx, len)));
//	    	Debug.printArray(recursion(nums, opts, 0, nums.size() - 1));
	    	return recursion(nums, opts, 0, nums.size() - 1);
	    }
	    private List<Integer> recursion(
	    		List<Integer> nums, List<Character> opts, 
	    		int beg, int end) {
	    	List<Integer> res = new ArrayList<Integer>();
	    	if (beg == end) { res.add(nums.get(beg)); return res; }
	    	for (int i = beg; i < end; ++ i) {	    		
	    		List<Integer> l_set = recursion(nums, opts, beg, i);
	    		List<Integer> r_set = recursion(nums, opts, i + 1, end);
	    		
	    		for (Integer l : l_set) {
	    			for (Integer r : r_set) {
	    				res.add(calculate(l, r, opts.get(i)));
	    			}
	    		}
	    	}
	    	return res;
		}
	    private Integer calculate(Integer a, Integer b, Character c) {
	    	Integer res = 0;
			switch (c) {
				case '+':res = a + b; break;
				case '-':res = a - b; break;
				case '*':res = a * b; break;
			}
			return res;
		}
	}

	public static void main(String[] args) {
		new Different_Ways_to_Add_Parentheses_241().new Solution()
		.diffWaysToCompute("10+11*13-1");
	}

}
