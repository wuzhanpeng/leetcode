package HashTable;

import java.util.HashMap;
import java.util.HashSet;

public class Word_Pattern_290 {
	
	// bijection between pattern and str
	public class Solution {
	    public boolean wordPattern(String pattern, String str) {
	    	int strIdx = -1;
	        HashMap<Character, String> map = new HashMap<Character, String>();
	        HashSet<String> keySet = new HashSet<String>();
	        for (int i = 0; i < pattern.length(); ++ i) {
	        	Character key = pattern.charAt(i);
	        	StringBuilder wordBuilder = new StringBuilder();
	        	for (++ strIdx; strIdx < str.length(); ++ strIdx) {
	        		if (' ' == str.charAt(strIdx)) { break; }
	        		wordBuilder.append(str.charAt(strIdx));
	        	}
	        	String word = wordBuilder.toString();
	        	if (word.equals("")) { return false; }
	        	if (map.containsKey(key)) {
	        		if (!map.get(key).equals(word)) { return false; }
	        	} else {
	        		if (keySet.contains(word)) { return false; }
	        		else { keySet.add(word); }
	        		map.put(key, word);
	        	}
	        }
	        if (strIdx < str.length()) { return false; }
	        return true;
	    }
	}

	public static void main(String[] args) {
		System.out.println(new Word_Pattern_290().new Solution().wordPattern("abba", "dog cat cat dog"));
		System.out.println(new Word_Pattern_290().new Solution().wordPattern("abba", "dog cat cat fish"));
		System.out.println(new Word_Pattern_290().new Solution().wordPattern("abba", "dog dog dog dog"));
		System.out.println(new Word_Pattern_290().new Solution().wordPattern("aaa", "aa aa aa aa"));
		System.out.println(new Word_Pattern_290().new Solution().wordPattern("aaa", "aa aa"));
		System.out.println(new Word_Pattern_290().new Solution().wordPattern("aab", "aa aa"));
	}

}
