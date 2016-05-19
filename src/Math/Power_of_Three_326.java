package Math;

//import java.util.HashSet;

public class Power_of_Three_326 {
	
//	public class Solution {
//	    public boolean isPowerOfThree(int n) {
//			HashSet<Integer> set = new HashSet<Integer>();
//			set.add(1);
//			set.add(3);
//			set.add(9);
//			set.add(27);
//			set.add(81);
//			set.add(243);
//			set.add(729);
//			set.add(2187);
//			set.add(6561);
//			set.add(19683);
//			set.add(59049);
//			set.add(177147);
//			set.add(531441);
//			set.add(1594323);
//			set.add(4782969);
//			set.add(14348907);
//			set.add(43046721);
//			set.add(129140163);
//			set.add(387420489); 
//			set.add(1162261467);
//	        
//	        return set.contains(n);
//	    }
//	}
		
	public class Solution {
		public boolean isPowerOfThree(int n) {
			return 0 < n && 0 == 1162261467 % n;
		}
	}

	public static void main(String[] args) {
		int i = 3;
		while (i < Integer.MAX_VALUE && i > 0) {
			System.out.printf("set.add(%d); ", i);
			i *= 3;
		}
	}

}
