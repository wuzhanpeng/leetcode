package BitManipulation;

public class Single_Number_II_137 {
	
	public class Solution {
	    public int singleNumber(int[] nums) {
	        int ret = 0;
	        for (int i = 0; i < 32; ++ i) {
	        	int cnt = 0;
	        	for (int num : nums) {
	        		if (((num >> i) & 1) == 1) {
	        			++ cnt;
	        		}
	        	}
	        	cnt %= 3;
	        	if (cnt == 1) {
	        		ret |= 1 << i;
	        	}
	        }
	        return ret;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
