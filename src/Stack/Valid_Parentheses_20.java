package Stack;

import java.util.Stack;

public class Valid_Parentheses_20 {
	
	public class Solution {
	    public boolean isValid(String s) {
	    	Stack<Character> Parentheses = new Stack<Character>();
	    	for (int i = 0; i < s.length(); ++ i) {
	    		char ch = s.charAt(i);
	    		if ('(' == ch || '[' == ch || '{' == ch) { Parentheses.add(ch); }
	    		else {
	    			if (Parentheses.isEmpty()) { return false; }
	    			char left = Parentheses.pop().charValue();
	    			switch (ch) {
					case ')': if ('(' != left) { return false; } break;						
					case ']': if ('[' != left) { return false; } break;
					case '}': if ('{' != left) { return false; } break;
					default: break;
					}
	    		}
	    	}
	        return Parentheses.isEmpty();
	    }
	}

	public static void main(String[] args) {
		System.out.println(new Valid_Parentheses_20().new Solution().isValid("()[]{}"));
	}

}
