package Math;

public class Excel_Sheet_Column_Title_168 {
	
	public class Solution {
	    public String convertToTitle(int n) {
	        StringBuilder colString = new StringBuilder();
	        while (n != 0) {
	        	colString.insert(0, (char) ('A' + (-- n) % 26));
	        	n /= 26;
	        }
	        return colString.toString();
	    }
	}

	public static void main(String[] args) {
		System.out.println(new Excel_Sheet_Column_Title_168().new Solution().convertToTitle(1189));
	}

}
