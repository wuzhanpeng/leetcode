package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pascal_Triangle_118 {
	
	public class Solution {
	    public List<List<Integer>> generate(int numRows) {
	    	if (0 == numRows) { return new ArrayList<List<Integer>>(); }
	    	List<List<Integer>> list = new ArrayList<List<Integer>>();
	    	list.add(Arrays.asList(new Integer[]{1}));
	        for (int i = 1; i < numRows; ++ i) {
	        	List<Integer> prev = list.get(i - 1);
	        	List<Integer> curr = new ArrayList<Integer>();
	        	for (int j = 0; j < i + 1; ++ j) {
	        		if (0 == j) { curr.add(prev.get(j)); }
	        		else if (i == j) { curr.add(prev.get(j - 1)); }
	        		else { curr.add(prev.get(j) + prev.get(j - 1)); }
	        	}
	        	list.add(curr);
	        }
	        return list;
	    }
	}

	public static void main(String[] args) {
	}

}
