package HashTable;

//import java.util.ArrayList;
//import java.util.Collections;
import java.util.HashMap;
//import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

public class Group_Anagrams_49 {
	
//	public class Solution {
//	    public List<List<String>> groupAnagrams(String[] strs) {
//	        Hap<ArrayList<Integer>, List<String>> map = new HashMap<>();
//	        for (String str : strs) {
//	        	// generate key
//	        	ArrayList<Integer> key = new ArrayList<>(26);
//	        	for (int i = 0; i < 26; ++ i) { key.add(i, 0); }
//	        	for (int i = str.length() - 1; i >= 0; -- i) {
//	        		int index = str.charAt(i) - 'a';
//	        		key.set(index, key.get(index) + 1);
//	        	}
//	        	// next step
//	        	if (map.containsKey(key)) {
//	        		map.get(key).add(str);
//	        	}else {
//	        		List<String> value = new LinkedList<>();
//	        		value.add(str);
//					map.put(key, value);
//				}
//	        }
//	        // answer
//	        List<List<String>> ans = new LinkedList<>(map.values());
//	        return ans;
//	    }
//	}
	
	// a little bit faster
	public class Solution {
	    public List<List<String>> groupAnagrams(String[] strs) {
	        HashMap<String, List<String>> map = new HashMap<>();
	        for (String str : strs) {
	        	// generate key
	        	StringBuffer sBuffer = new StringBuffer();
	        	int[] cnt = new int[26];
				for (int i = str.length() - 1; i >= 0; -- i) {
					++ cnt[str.charAt(i) - 'a'];
				}
				for (int x : cnt) { sBuffer.append(x); }
	        	// next step
				String key = sBuffer.toString();
	        	if (map.containsKey(key)) {
	        		map.get(key).add(str);
	        	}else {
	        		List<String> value = new LinkedList<>();
	        		value.add(str);
					map.put(key, value);
				}
	        }
	        // answer
	        List<List<String>> ans = new LinkedList<>(map.values());
	        return ans;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  equal?
//		String expected = 	"[[\"sol\"],[\"wow\"],[\"gap\"],[\"hem\"],[\"yap\"],[\"bum\"],[\"ugh\",\"ugh\"],[\"aha\"],[\"jab\"],[\"eve\"],[\"bop\"],[\"lyx\"],[\"jed\"],[\"iva\"],[\"rod\"],[\"boo\"],[\"brr\"],[\"hog\"],[\"nay\"],[\"mir\"],[\"deb\",\"deb\"],[\"aft\"],[\"dis\"],[\"yea\"],[\"hos\"],[\"rye\"],[\"hey\"],[\"doc\"],[\"bob\"],[\"eel\"],[\"pen\"],[\"job\"],[\"max\"],[\"oho\"],[\"lye\"],[\"ram\"],[\"nap\"],[\"elf\"],[\"qua\"],[\"pup\",\"pup\"],[\"let\"],[\"gym\"],[\"nam\"],[\"bye\"],[\"lon\"]]";
//		String output = 	"[[\"iva\"],[\"dis\"],[\"ram\"],[\"bye\"],[\"bop\"],[\"pen\"],[\"bum\"],[\"ugh\",\"ugh\"],[\"rod\"],[\"let\"],[\"hey\"],[\"max\"],[\"qua\"],[\"nay\"],[\"mir\"],[\"aha\"],[\"lon\"],[\"hos\"],[\"yap\"],[\"lye\"],[\"gym\"],[\"sol\"],[\"rye\"],[\"boo\",\"bob\"],[\"eel\"],[\"brr\"],[\"oho\"],[\"eve\"],[\"lyx\"],[\"pup\",\"pup\"],[\"wow\"],[\"deb\",\"deb\"],[\"jab\"],[\"jed\"],[\"doc\"],[\"elf\"],[\"gap\"],[\"hem\"],[\"job\"],[\"aft\"],[\"nam\"],[\"hog\"],[\"yea\"],[\"nap\"]]";
//		
//		ArrayList<String> r1 = new ArrayList<>(), r2 = new ArrayList<>();
//		Pattern pattern = Pattern.compile("[a-z]+");
//		Matcher e = pattern.matcher(expected);
//		while (e.find()) { r1.add(e.group()); }
//		Matcher o = pattern.matcher(output);
//		while (o.find()) { r2.add(o.group()); }
//		Collections.sort(r1);Collections.sort(r2);
//		System.out.println("Exp\tOut");
//		for (Iterator<String> i = r1.iterator(), j = r2.iterator();
//				i.hasNext() || j.hasNext();) {
//			System.out.printf("%s\t%s\n", i.next(), j.next());
//		}
		
		new Group_Anagrams_49().new Solution().groupAnagrams(new String[]{"",""});
	}

}
