package HashTable;

import java.util.HashMap;

public class Two_Sum_1 {
	
	public class Solution {
	    public int[] twoSum(int[] nums, int target) {
	        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	        for (int i = 0; i < nums.length; ++ i) {
	        	if (map.containsKey(target - nums[i])) {
	        		return new int[]{map.get(target - nums[i]).intValue(), i};
	        	}
	        	map.put(nums[i], i);
	        }
	        return null;
	    }
	}

	public static void main(String[] args) {
		int[] t = new Two_Sum_1().new Solution().twoSum(new int[]{2, 7, 11, 15}, 17);
		for (int x:t) {System.out.println(x);}		
	}

}
