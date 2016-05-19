package Greedy;

public class Best_Time_to_Buy_and_Sell_Stock_II_122 {
	
	public class Solution {
	    public int maxProfit(int[] prices) {
	    	int sum = 0, profit = 0, buy = Integer.MAX_VALUE, prev = Integer.MAX_VALUE;
	        for (int price : prices) {
	        	if (price > prev) {
	        		profit = price - buy;
 	        	} else {
					buy = price;
					sum += profit;
					profit = 0;
				}
	        	prev = price;
	        }
	        // for the last rising region
	        sum += profit;
	        return sum;
	    }
	}

	public static void main(String[] args) {
		System.out.println(new Best_Time_to_Buy_and_Sell_Stock_II_122().new Solution()
				.maxProfit(new int[]{1,2}));
	}

}
