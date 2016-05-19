package DynamicProgramming;

public class Best_Time_to_Buy_and_Sell_Stock_121 {
	
	public class Solution {
	    public int maxProfit(int[] prices) {
	        int buy_price = Integer.MAX_VALUE, profit = 0;
	        for (int price : prices) {
	        	if (price > buy_price) {
	        		int delta = price - buy_price;
	        		if (delta > profit) { profit = delta; }
	        	} else {
	        		buy_price = price;
	        	}
	        }
	        return profit;
	    }
	}

	public static void main(String[] args) {
	}

}
