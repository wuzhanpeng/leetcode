package String;

public class Length_of_Last_Word_58 {
	
	public class Solution {
	    public int lengthOfLastWord(String s) {
	    	int len = 0;
	        for (int i = s.length() - 1; i >= 0; -- i) {
	        	if (' ' == s.charAt(i)) {
	        		if (0 < len) { break; }
	        	} else {
	        		++ len;
	        	}
	        }
	        return len;
	    }
	}

	public static void main(String[] args) {
	}

}
