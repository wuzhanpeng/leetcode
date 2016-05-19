package String;

public class Integer_to_Roman_12 {
	
	/** Input is guaranteed to be within the range from 1 to 3999. */
	/** 
	 * Roman numeral
	 * I   V   X   L   C   D   M
	 * 1   5   10  50  100 500 1000
	 *
	 */
	public class Solution {
	    public String intToRoman(int num) {
	        int m = num / 1000; num %= 1000;
	        int d = num / 500; num %= 500;
	        int c = num / 100; num %= 100;
	        int l = num / 50; num %= 50;
	        int x = num / 10; num %= 10;
	        int v = num / 5; num %= 5;
	        int i = num / 1; num %= 1;
	        
	        StringBuilder roman = new StringBuilder();
	        while(m -- > 0) { roman.append('M'); }
	        while(d -- > 0) { roman.append('D'); }
	        if (c == 4) {
	        	int lastPos = roman.length() - 1;
	        	if (lastPos >= 0 && roman.charAt(lastPos) == 'D') {
	        		roman.deleteCharAt(lastPos);
	        		roman.append("CM");
	        	} else {
	        		roman.append("CD");
				}
	        	c = 0;
	        }
	        while(c -- > 0) { roman.append('C'); }
	        while(l -- > 0) { roman.append('L'); }
	        if (x == 4) {
	        	int lastPos = roman.length() - 1;
	        	if (lastPos >= 0 && roman.charAt(lastPos) == 'L') {
	        		roman.deleteCharAt(lastPos);
	        		roman.append("XC");
	        	} else {
	        		roman.append("XL");
				}
	        	x = 0;
	        }
	        while(x -- > 0) { roman.append('X'); }
	        while(v -- > 0) { roman.append('V'); }
	        if (i == 4) {
	        	int lastPos = roman.length() - 1;
	        	if (lastPos >= 0 && roman.charAt(lastPos) == 'V') {
	        		roman.deleteCharAt(lastPos);
	        		roman.append("IX");
	        	} else {
	        		roman.append("IV");
				}
	        	i = 0;
	        }
	        while(i -- > 0) { roman.append('I'); }
	        
	        return roman.toString();
	    }
	}

	public static void main(String[] args) {
		System.out.println(new Integer_to_Roman_12().new Solution().intToRoman(14));
	}

}
