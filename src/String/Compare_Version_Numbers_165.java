package String;

public class Compare_Version_Numbers_165 {
	
	public class Solution {
	    public int compareVersion(String version1, String version2) {
	        String[] v1 = version1.split("\\."), v2 = version2.split("\\.");
	        int i = 0;
	        for (; i < v1.length && i < v2.length; ++ i) {
	        	int i1 = Integer.valueOf(v1[i]);
	        	int i2 = Integer.valueOf(v2[i]);
	        	if (i1 == i2) { continue; }
	        	return i1 < i2 ? -1 : 1;
	        }
	        if (v1.length == v2.length) { return 0; }
	        else {
				String[] res =  v1.length < v2.length ? v2 : v1;
				for (; i < res.length; ++ i) {
					if (Integer.valueOf(res[i]) != 0) {
						return v1.length < v2.length ? -1 : 1;
					}
				}
				return 0;
			}
	    }
	}

	public static void main(String[] args) {
		System.out.println(new Compare_Version_Numbers_165().new Solution().compareVersion("1.0", "1"));
	}

}
