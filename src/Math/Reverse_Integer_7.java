package Math;

public class Reverse_Integer_7 {
	
	public class Solution {
	    public int reverse(int x) {
	        int sign = x < 0 ? -1 : 1;
	        long sum = 0, x_l = x;
	        x_l *= sign;
	        while (x_l != 0) {
	        	int end = (int) (x_l % 10);
	        	x_l /= 10;
	        	sum = sum * 10 + end;
	        	if (sum > Integer.MAX_VALUE) { return 0; }
	        }
	        return (int) sum * sign;
	    }
	}

	public static void main(String[] args) {
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Math.pow(2, 31) - 1);
//		System.out.println(Long.MAX_VALUE );
		System.out.println(new Reverse_Integer_7().new Solution().reverse(1234567899));
	}

}
