package Math;

public class Add_Digits_258 {
	
	public class Solution {
	    public int addDigits(int num) {
	    	if (num == 0) return 0;
	        return num%9 == 0?9:num%9;
	    }
	}

	public static void main(String[] args) {
		Add_Digits_258.Solution test = new Add_Digits_258().new Solution();
		System.out.println(test.addDigits(38));
		System.out.println(test.addDigits(0));
		System.out.println(test.addDigits(9));
		System.out.println(test.addDigits(18));
	}

}
