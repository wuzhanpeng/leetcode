package Array;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Kth_Largest_Element_in_an_Array_215 {
	
	public class Solution {
	    public int findKthLargest(int[] nums, int k) {
	        PriorityQueue<Integer> max = new PriorityQueue<>(new Comparator<Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {
					return o2 - o1;
				}
			});
	        for (int x : nums) { max.add(x); }
	        int target = 0;
	        for (int i = 0; i < k; ++ i) { target = max.poll(); }
	        return target;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
