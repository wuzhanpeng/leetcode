package Backtracking;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Palindrome_Partitioning_131 {
	
	public class Solution {
		private HashMap<String, Boolean> records = new HashMap<>();
		private List<List<String>> ret = new LinkedList<>();
		private boolean isPalindrome(String s) {
			if (records.containsKey(s)) { return records.get(s); }
			for (int beg = 0, end = s.length() - 1; beg < end; ++ beg, -- end) {
				if (s.charAt(beg) != s.charAt(end)) {
					records.put(s, false);
					return false;
				}
			}
			records.put(s, true);
			return true;
		}
		@SuppressWarnings("unchecked")
		private void bt(String s, LinkedList<String> ans, int beg, int len) {					
			if (beg == len) {
				ret.add((List<String>) ans.clone());
			}
			for (int end = beg + 1; end <= len; ++ end) {
				String subStr = s.substring(beg, end);
				if (isPalindrome(subStr)) {
					ans.add(subStr);
					bt(s, ans, end, len);
					ans.removeLast();
				}
			}
		}
	    public List<List<String>> partition(String s) {
	        bt(s, new LinkedList<>(), 0, s.length());
	        return ret;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
