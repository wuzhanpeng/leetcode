package Strategy;

public class First_Bad_Version_278 {
	
	protected class VersionControl {
		boolean isBadVersion(int version) { return 1702766718 < version; };
	}
	
	public class Solution extends VersionControl {
	    public int firstBadVersion(int n) {
	    	if (isBadVersion(1)) { return 1; }
	        return recursion(2, (long) n + 1);
	    }
	    private int recursion(long l, long r) {
	    	long m = (l + r) / 2;
			if (!isBadVersion((int) m)) { return recursion(m + 1, r); }
			else {
				if (isBadVersion((int) (m - 1))) {
					return recursion(l, m);
				} else {
					return (int) m;
				}
			}
		}
	}

	public static void main(String[] args) {
		System.out.println(new First_Bad_Version_278().new Solution().firstBadVersion(Integer.MAX_VALUE));
	}
//	2126753390
//	1702766719 is the first bad version.
}
