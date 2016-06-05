package Stack;

import java.util.Stack;

public class Verify_Preorder_Serialization_of_a_Binary_Tree_331 {
	
	/** Another solution: 
	 * https://leetcode.com/discuss/83824/7-lines-easy-java-solution */
	public class Solution {
	    public boolean isValidSerialization(String preorder) {
	        int len = preorder.length(), start = 0;
	        if ('#' == preorder.charAt(0) && preorder.length() > 1) { return false; }
	        Stack<String> stack = new Stack<>();
	        for (int i = 0; i < len; ++ i) {
	        	start = i;
	        	while (i < len && ',' != preorder.charAt(i)) { ++ i; }
	        	String sub = preorder.substring(start, i);
	        	if (!stack.isEmpty() && stack.peek().equals("#") && sub.equals("#")) {
	        		do {
	        			if (2 > stack.size()) { return false; }
		        		stack.pop();stack.pop();
//						System.out.printf("merge\n");
	        		} while (!stack.isEmpty() && stack.peek().equals("#"));
		        	stack.push("#");
	        	} else {
					stack.push(sub);
//					System.out.printf("push: %s\n", sub);
				}
	        }
	        return 1 == stack.size() && stack.peek().equals("#");
	    }
	}

	public static void main(String[] args) {
		System.out.println(new Verify_Preorder_Serialization_of_a_Binary_Tree_331().new Solution()
				.isValidSerialization("1,1,#,1,#,#,1,1,#,#,#"));
		System.out.println(new Verify_Preorder_Serialization_of_a_Binary_Tree_331().new Solution()
				.isValidSerialization("1,#"));
		System.out.println(new Verify_Preorder_Serialization_of_a_Binary_Tree_331().new Solution()
				.isValidSerialization("1,#,#,1"));
	}

}
