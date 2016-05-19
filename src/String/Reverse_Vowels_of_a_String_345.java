package String;

public class Reverse_Vowels_of_a_String_345 {
	
	public class Solution {
		
		private boolean isVowel(char c) {
			return (c == 'a' || c == 'A' || 
					c == 'e' || c == 'E' || 
					c == 'i' || c == 'I' || 
					c == 'o' || c == 'O' || 
					c == 'u' || c == 'U');
		}
		
	    public String reverseVowels(String s) {	        
	    	
	    	int beg = 0, end = s.length() - 1;
	    	StringBuilder newStr = new StringBuilder(s);
	    	
	    	while (beg < end) {
	    		while (beg < s.length() && !isVowel(s.charAt(beg))) { ++ beg; }
	    		while (end >= 0 && !isVowel(s.charAt(end))) { -- end; }
	    		if (beg < end) {
	    			newStr.setCharAt(beg, s.charAt(end));
	    			newStr.setCharAt(end, s.charAt(beg));
	    			++ beg; -- end;
	    		}
	    	}
	    	return newStr.toString();
	    }
	}

	public static void main(String[] args) {
		System.out.println(new Reverse_Vowels_of_a_String_345()
				.new Solution().reverseVowels("hello"));
		System.out.println(new Reverse_Vowels_of_a_String_345()
				.new Solution().reverseVowels("leetcode"));
		System.out.println(new Reverse_Vowels_of_a_String_345()
				.new Solution().reverseVowels("lEetcode"));
	}

}
