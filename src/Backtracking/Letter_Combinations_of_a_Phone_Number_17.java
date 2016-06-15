package Backtracking;

import java.util.LinkedList;
import java.util.List;

import leetcode.util.Debug;

public class Letter_Combinations_of_a_Phone_Number_17 {
	
	public class Solution {
		private List<String> ans = new LinkedList<String>();
		private String[] map = new String[]{
				"abc", "def", "ghi", "jkl",
				"mno", "pqrs", "tuv", "wxyz"
		};
	    public List<String> letterCombinations(String digits) {
	    	int len = digits.length();
	    	if (null == digits || 0 == len) { return ans; }
	    	int[] seq = new int[len];
	    	for (int i = 0; i < len; ++ i) {
	    		char c = digits.charAt(i);
	    		if (c < '2' || c > '9') { return ans; }
	    		seq[i] = c - '2';
	    	}
	    	backtracking(seq, 0, new StringBuilder());
	        return ans;
	    }
	    private void backtracking(int[] seq, int idx, StringBuilder combination) {
			if (idx == seq.length) {
				ans.add(combination.toString());
				return;
			}
			String letter = map[seq[idx]];
			int len = letter.length();
			for (int i = 0; i < len; ++ i) {
				combination.append(letter.charAt(i));
				backtracking(seq, idx + 1, combination);
				combination.deleteCharAt(idx);
			}
		}
	}

	public static void main(String[] args) {
		Debug.printList(new Letter_Combinations_of_a_Phone_Number_17().new Solution()
				.letterCombinations(""));
		Debug.printList(new Letter_Combinations_of_a_Phone_Number_17().new Solution()
				.letterCombinations("0"));
		Debug.printList(new Letter_Combinations_of_a_Phone_Number_17().new Solution()
				.letterCombinations("2"));
		Debug.printList(new Letter_Combinations_of_a_Phone_Number_17().new Solution()
				.letterCombinations("23"));
		Debug.printList(new Letter_Combinations_of_a_Phone_Number_17().new Solution()
				.letterCombinations("234"));
	}

}
