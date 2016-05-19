package String;

public class Longest_Common_Prefix_14 {
	
	public class Solution {
	    public String longestCommonPrefix(String[] strs) {
	    	if (null == strs || 0 == strs.length) { return ""; }
	        StringBuilder prefix = new StringBuilder();
	        int len = 0;
	        boolean tag = false;
	        while (true) {
	        	if (len >= strs[0].length()) { break; }
	        	char ch = strs[0].charAt(len);
		        for (int i = 1; i < strs.length; ++ i) {
		        	if (len < strs[i].length()) {
		        		if (strs[i].charAt(len) != ch) {
		        			tag = true;
							break;
		        		}
		        	} else {
		        		tag = true;
						break;
					}
		        }
	        	if (tag) { break; }
	        	else {
					prefix.append(ch);
				}
		        ++ len;
	        }
	        return prefix.toString();
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
