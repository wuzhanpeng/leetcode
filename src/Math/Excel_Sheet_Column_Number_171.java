package Math;

public class Excel_Sheet_Column_Number_171 {
	
	public class Solution {
	    public int titleToNumber(String s) {
	        int sum = 0, len = s.length();
	        for (int i = 0; i < len; ++ i) {
	        	sum += (s.charAt(i) - 'A' + 1) * Math.pow(26, len - i - 1);
	        }
	        return sum;
	    }
	}

	public static void main(String[] args) {
//		System.out.println('C' - 'A');
		System.out.println(new Excel_Sheet_Column_Number_171().new Solution().titleToNumber("ASS"));
	}

}
