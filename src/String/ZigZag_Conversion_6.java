package String;

public class ZigZag_Conversion_6 {
	
	public class Solution {
	    public String convert(String s, int numRows) {
	        StringBuilder[] lines = new StringBuilder[numRows];
	        for (int i = 0; i < numRows; ++ i) { lines[i] = new StringBuilder(); }
	        int len = s.length();
	        for (int i = 0, row = 0; i < len; row = 0) {
	        	while (row < numRows && i < len) {
	        		lines[row ++].append(s.charAt(i ++));
	        	}
	        	-- row;
	        	while (row > 1 && i < len) {
	        		lines[-- row].append(s.charAt(i ++));
	        	}
	        }
	        StringBuilder zigzagString = new StringBuilder();
	        for (StringBuilder line : lines) {
	        	zigzagString.append(line);
	        }
	        return zigzagString.toString();
	    }
	}

	public static void main(String[] args) {
//		System.out.println(new ZigZag_Conversion_6().new Solution().convert("PAYPALISHIRING", 3));
		System.out.println(new ZigZag_Conversion_6().new Solution().convert("AB", 1));
	}

}
