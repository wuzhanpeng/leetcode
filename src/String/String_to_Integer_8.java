package String;

public class String_to_Integer_8 {
	
	public class Solution {
	    public int myAtoi(String str) {
	        long num = 0;
	        boolean hasMinus = false, hasOther = false, isOverflow = false;
	        int i = 0, len = str.length();
	        while (i < len && ' ' == str.charAt(i)) { ++ i; }
	        for (; i < len; ++ i) {
	        	if (Character.isDigit(str.charAt(i))) {
	        		long res = str.charAt(i) - '0';
	        		for (int j = 0; j < 10; ++ j) {
	        			res += num;
	        			if (res < 0) { isOverflow = true; break; }
	        		}	        			
	        		num = res;
	        	} else if ('-' == str.charAt(i)) {
					if (!hasOther) { hasMinus = true; hasOther = true; }
					else { return 0; }
				} else if ('+' == str.charAt(i)) {
					if (!hasOther) { hasOther = true; }
					else { return 0; }
				} else {
					break;
				}
	        }	        
	        if (!isOverflow && hasMinus) { num *= -1; }
	        if (num > Integer.MAX_VALUE || (isOverflow && !hasMinus)) { return Integer.MAX_VALUE; }
	        if (num < Integer.MIN_VALUE || (isOverflow && hasMinus)) { return Integer.MIN_VALUE; }
	        return (int) num;
	    }
	}

	public static void main(String[] args) {
		System.out.println(new String_to_Integer_8().new Solution().myAtoi("9223372036854775809"));
		System.out.println(new String_to_Integer_8().new Solution().myAtoi("-9223372036854775809"));
		System.out.println(new String_to_Integer_8().new Solution().myAtoi("18446744073709551617"));
		System.out.println(new String_to_Integer_8().new Solution().myAtoi("  +012a4"));
//		System.out.println(Long.MAX_VALUE);
//		System.out.println("9223372036854775809");
	}

}
