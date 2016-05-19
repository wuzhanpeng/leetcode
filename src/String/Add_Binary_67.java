package String;

public class Add_Binary_67 {
	
	public class Solution {
	    public String addBinary(String a, String b) {
	    	StringBuilder bStr = new StringBuilder();
	    	boolean hasOne = false;
	    	int i = a.length() - 1, j = b.length() - 1, k = -1;
	        for (; i >= 0 && j >= 0; -- i, -- j) {
	        	if (hasOne) {
	        		if ('1' == a.charAt(i) && '1' == b.charAt(j)) {
	        			hasOne = true;
	        			bStr.insert(0, '1');
	        		} else if ('0' == a.charAt(i) && '0' == b.charAt(j)) {
	        			hasOne = false;
	        			bStr.insert(0, '1');
					} else {
						hasOne = true;
	        			bStr.insert(0, '0');
					}
	        	} else {
	        		if ('1' == a.charAt(i) && '1' == b.charAt(j)) {
	        			hasOne = true;
	        			bStr.insert(0, '0');
	        		} else if ('0' == a.charAt(i) && '0' == b.charAt(j)) {
	        			hasOne = false;
	        			bStr.insert(0, '0');
					} else {
						hasOne = false;
	        			bStr.insert(0, '1');
					}
				}
	        }
	        String leftStr = new String();
	        if (i >= 0) { leftStr = a; k = i; }
	        if (j >= 0) { leftStr = b; k = j; }
	        for (; k >= 0; -- k) {
	        	if (hasOne && '1' == leftStr.charAt(k)) {
	        		hasOne = true;
	        		bStr.insert(0, '0');
	        	} else if (!hasOne && '0' == leftStr.charAt(k)) {
	        		hasOne = false;
	        		bStr.insert(0, '0');
	        	} else {
					hasOne = false;
					bStr.insert(0, '1');
				}
	        }
	        if (hasOne) { bStr.insert(0, '1'); }
	        return bStr.toString();
	    }
	}

	public static void main(String[] args) {
		System.out.println(new Add_Binary_67().new Solution().addBinary("11001", "10011"));
		System.out.println(new Add_Binary_67().new Solution().addBinary("1", "1"));
	}

}
