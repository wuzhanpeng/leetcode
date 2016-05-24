package Array;

public class Container_With_Most_Water_11 {
	
//	public class Solution {
//	    public int maxArea(int[] height) {
//	        int max = 0;
//	        for (int i = 0; i < height.length; ++ i) {
//	        	for (int j = i + 1; j < height.length; ++ j) {
//	        		int area = (j - i) * (height[i] > height[j] ? height[j] : height[i]);
//	        		if (area > max) {
//	        			max = area;
//	        		}
//	        	}
//	        }
//	        return max;
//	    }
//	}
	
	public class Solution {
		public int maxArea(int[] height) {
			int max = 0, l = 0, r = height.length - 1;
			while (l < r) {
				int area;
				if (height[l] > height[r]) { area = (r - l) * height[r --]; }
				else { area = (r - l) * height[l ++]; }
				if (area > max) { max = area; }
			}
			return max;
		}
	}

	public static void main(String[] args) {
		new Container_With_Most_Water_11().new Solution().maxArea(new int[]{});
	}

}
