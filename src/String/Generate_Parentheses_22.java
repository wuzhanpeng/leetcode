package String;

import java.util.LinkedList;
import java.util.List;

public class Generate_Parentheses_22 {
	
	public class Solution {
		// sharing variable
		List<String> list = new LinkedList<String>();
	    public List<String> generateParenthesis(int n) {
	    	if (n > 0) {
		        char[] status = new char[2 * n];
		        status[0] = '(';
		        traversal(status, n, 1, 0, 1);
	    	}
	        return list;
	    }
	    private void traversal(char[] status, int quota, int lp_sum, int rp_sum, int idx) {
			if (lp_sum == quota) {
				backtracking(status, idx);
				return;
			}
			status[idx] = '(';
			traversal(status, quota, lp_sum + 1, rp_sum, idx + 1);
			if (lp_sum > rp_sum) { 
				status[idx] = ')';
				traversal(status, quota, lp_sum, rp_sum + 1, idx + 1);
			}
		}
	    private void backtracking(char[] status, int idx) {
	    	int pdt = 0;
	    	for (int b_ptr = idx - 1, f_ptr = idx; b_ptr >= 0; -- b_ptr) {
	    		if (status[b_ptr] == '(') {
	    			if (pdt == 0) { status[f_ptr ++] = ')'; }
	    			else { -- pdt; }
	    		}
	    		// status[b_ptr] == ')'
	    		else { ++ pdt; }
	    	}
	    	// generate
	    	list.add(new String(status));
		}
	}

	public static void main(String[] args) {
		List<String> list = new Generate_Parentheses_22()
				.new Solution().generateParenthesis(0);
		for (String s : list) { System.out.println(s); }
	}

}
