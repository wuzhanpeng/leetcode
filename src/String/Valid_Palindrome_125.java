package String;

public class Valid_Palindrome_125 {
	
	public class Solution {
	    public boolean isPalindrome(String s) {
	    	if (null == s || 2 > s.length()) { return true; }
	        int head = 0, tail = s.length() - 1;
	        while (head < tail) {
	        	while (head < tail && !Character.isLetterOrDigit(s.charAt(head))) { ++ head; }
	        	while (head < tail && !Character.isLetterOrDigit(s.charAt(tail))) { -- tail; }
	        	if (Character.toLowerCase(s.charAt(head ++)) != Character.toLowerCase(s.charAt(tail --))) { return false; }
	        }
	        return true;
	    }
	}

	public static void main(String[] args) {
		System.out.println(new Valid_Palindrome_125().new Solution().isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println(new Valid_Palindrome_125().new Solution().isPalindrome("race a car"));
		System.out.println(new Valid_Palindrome_125().new Solution().isPalindrome(".,7+-"));
	}

}
