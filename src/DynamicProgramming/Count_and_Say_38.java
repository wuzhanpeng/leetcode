package DynamicProgramming;

public class Count_and_Say_38 {
	
	public class Solution {
		private String[] aux = new String[50];
		private int size = 1;
		public Solution() {
			aux[0] = "1";
		}
	    public String countAndSay(int n) {
	        if (n > size) {
	        	for (int i = size; i < n; ++ i) {
	        		StringBuilder say = new StringBuilder();	        		
	        		for (int j = 0, len = aux[i - 1].length(); j < len; ++ j) {
	        			char ch = aux[i - 1].charAt(j);
	        			int count = 1;
	        			while (j + 1 < len && ch == aux[i - 1].charAt(j + 1)) {
	        				++ count;
	        				++ j;
	        			}
	        			say.append("" + count + ch);
	        		}
	        		aux[i] = say.toString();
	        	}
	        }
	        size = n;
	        return aux[n - 1];
	    }
	}

	public static void main(String[] args) {
		Count_and_Say_38.Solution tSolution = new Count_and_Say_38().new Solution();
		String last = tSolution.countAndSay(40);
		System.out.println(last.length());
	}

}
