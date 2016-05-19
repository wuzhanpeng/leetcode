package Math;

public class Palindrome_Number_9 {
	
	public class Solution {
	    public boolean isPalindrome(int x) {
	    	if (x < 0) { return false; }
	    	String s = String.valueOf(x);
	    	int len = s.length();
	    	for (int i = 0; i < len/2; ++ i) {
	    		if (s.charAt(i) != s.charAt(len - i - 1)) { return false; }
	    	}
	        return true;
	    }
	}

	public static void main(String[] args) {
		System.out.println(new Palindrome_Number_9().new Solution().isPalindrome(111));
	}

}
