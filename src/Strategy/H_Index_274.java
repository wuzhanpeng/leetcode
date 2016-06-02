package Strategy;

public class H_Index_274 {
	
	public class Solution {
		// Count O(n)
	    public int hIndex(int[] citations) {
	        int[] aux = new int[citations.length + 1];
	        for (int citation : citations) {
	        	if (citation < citations.length) { ++ aux[citation]; }
	        	else { ++ aux[citations.length]; }
	        }
	        for (int i = citations.length, sum = 0; i > 0; -- i) {
	        	sum += aux[i];
	        	if (sum >= i) { return i; }
	        }
	        return 0;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
