package String;

import java.util.Hashtable;

public class Valid_Anagram_242 {
	
	public class Solution {
	    public boolean isAnagram(String s, String t) {
	    	Hashtable<String, Integer> map = new Hashtable<String, Integer>();
	    	for (int i = s.length() - 1; i >= 0; -- i) {
	    		Integer cnt = map.containsKey(String.valueOf(s.charAt(i))) ? map.get(String.valueOf(s.charAt(i))) : 0;
	    		map.put(String.valueOf(s.charAt(i)), cnt + 1);
	    	}
	    	for (int i = t.length() - 1; i >= 0; -- i) {
	    		if (map.containsKey(String.valueOf(t.charAt(i)))) {
	    			Integer cnt = map.get(String.valueOf(t.charAt(i)));
	    			if (cnt > 0) {
	    				map.put(String.valueOf(t.charAt(i)), cnt - 1);
					} else {
						return false;
					}
	    		} else {
	    			return false;
	    		}
	    	}
	    	for (String key : map.keySet()) {
	    		if (map.get(key) != 0) {
	    			return false;
	    		}
	    	}
	    	return true;
	    }
	}

	public static void main(String[] args) {
//		System.out.println(new Valid_Anagram_242().new Solution().isAnagram("a", "a"));
		System.out.println(new Valid_Anagram_242().new Solution().isAnagram("aa", "a"));
	}

}
