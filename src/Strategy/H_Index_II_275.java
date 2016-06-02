package Strategy;

public class H_Index_II_275 {
	
	public class Solution {
	    public int hIndex(int[] citations) {
	        int l = 0, r = citations.length - 1;
	        while (l < r) {
	        	int mid = (l + r) / 2;
	        	if (citations[mid] >= citations.length - mid) { r = mid; }
	        	else { l = mid + 1; }
	        }
	        return citations.length - r;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
