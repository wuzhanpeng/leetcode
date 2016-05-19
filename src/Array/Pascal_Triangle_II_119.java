package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pascal_Triangle_II_119 {
	
	public class Solution {
		private List<List<Integer>> list = new ArrayList<List<Integer>>();
		public Solution() {
			list.add(Arrays.asList(new Integer[]{1}));
		}
	    public List<Integer> getRow(int rowIndex) {

	    	for (int row = list.size(); row < rowIndex + 2; ++ row) {
				List<Integer> prev = list.get(row - 1);
				List<Integer> curr = new ArrayList<Integer>();
				for (int i = 0; i < row + 1; ++ i) {
					if (0 == i) {
						curr.add(prev.get(i));
					} else if (row == i) {
						curr.add(prev.get(i - 1));
					} else {
						curr.add(prev.get(i) + prev.get(i - 1));
					}
				}
				list.add(curr);
	    	}
	        return list.get(rowIndex);
	    }
	}

	public static void main(String[] args) {
	}

}
