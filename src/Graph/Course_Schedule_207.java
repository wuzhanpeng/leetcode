package Graph;

import java.util.Arrays;
import java.util.Comparator;

import leetcode.util.Debug;

public class Course_Schedule_207 {
	
	public class Solution {
	    public boolean canFinish(int numCourses, int[][] prerequisites) {
	        boolean[] hasFinished = new boolean[numCourses];
	        for (int i = prerequisites.length - 1; i >= 0; -- i) {
	        	for (int j = prerequisites[0].length - 1; j >= 0; -- j) {
	        		if (hasFinished[prerequisites[i][j]]) { return false; }
	        		hasFinished[prerequisites[i][j]] = true;
	        	}
	        }
	        return true;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] s = new int[][]{{1,0},{2,0},{1,2}};
		Arrays.sort(s, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o1[1] - o2[1];
			}
		});
		Debug.printMatrix(s);
	}

}
