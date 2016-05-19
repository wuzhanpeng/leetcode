package HashTable;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class Top_K_Frequent_Elements_347 {
	
	public class Solution {
	    public List<Integer> topKFrequent(int[] nums, int k) {
	        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	        for (int x : nums) {
	        	Integer value = map.get(x);
	        	map.put(x, null == value ? 1 : value + 1);
	        }
	        PriorityQueue<Map.Entry<Integer, Integer>> pQueue = new 
	        		PriorityQueue<Map.Entry<Integer, Integer>>(new Comparator<Map.Entry<Integer, Integer>>() {

						@Override
						public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
							return o2.getValue() - o1.getValue();
						}
					});
	        pQueue.addAll(map.entrySet());
	        List<Integer> topK = new LinkedList<Integer>();
	        while (!pQueue.isEmpty() && k -- > 0) {
	        	topK.add(pQueue.poll().getKey());
	        }
	        return topK;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
