package String;

import java.util.HashMap;

public class Roman_to_Integer_13 {
	
	/**
	 * 
	 * Roman numeral
	 * I   V   X   L   C   D   M
	 * 1   5   10  50  100 500 1000
	 *
	 */
	public class Solution {
	    public int romanToInt(String s) {
	    	
	    	HashMap<String, Integer> map = new HashMap<String, Integer>();
	    	map.put("I", 1);map.put("V", 5);map.put("X", 10);map.put("L", 50);
	    	map.put("C", 100);map.put("D", 500);map.put("M", 1000);
	    	
	    	int sum = 0, prev_num = 0;
	    	for (int i = 0; i < s.length(); ++ i) {
	    		int num = map.get(String.valueOf(s.charAt(i)));
	    		if (num > prev_num) {
	    			sum += num - 2 * prev_num;
	    		} else {
	    			sum += num;
	    		}
	    		prev_num = num;
	    	}
	        return sum;
	    }
	}

	public static void main(String[] args) {
		System.out.println(new Roman_to_Integer_13().new Solution().romanToInt("XII"));
		System.out.println(new Roman_to_Integer_13().new Solution().romanToInt("MCMXCVI"));
	}

}
