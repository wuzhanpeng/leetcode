package DynamicProgramming;

public class Best_Time_to_Buy_and_Sell_Stock_with_Cooldown_309 {
	
	public class Solution {
	    public int maxProfit(int[] prices) {
	    	if (null == prices || 1 >= prices.length) { return 0; }
	        int[] sell = new int[prices.length], cooldown = new int[prices.length];
	        sell[1] = prices[1] - prices[0];
	        for (int i = 2; i < prices.length; ++ i) {
	        	cooldown[i] = Math.max(sell[i - 1], cooldown[i - 1]);
	        	sell[i] = prices[i] - prices[i - 1]					// i-th day's profit
	        			+ Math.max(sell[i - 1], cooldown[i - 2]);	// while i-th day sells
	        }
	        return Math.max(cooldown[prices.length - 1], sell[prices.length - 1]);
	    }
	}

	public static void main(String[] args) {
		//3
		System.out.println(new Best_Time_to_Buy_and_Sell_Stock_with_Cooldown_309().new Solution()
				.maxProfit(new int[]{1,2,3,0,2}));
		//0
		System.out.println(new Best_Time_to_Buy_and_Sell_Stock_with_Cooldown_309().new Solution()
				.maxProfit(new int[]{2,1}));
		//3
		System.out.println(new Best_Time_to_Buy_and_Sell_Stock_with_Cooldown_309().new Solution()
				.maxProfit(new int[]{1,4,2}));
		//6
		System.out.println(new Best_Time_to_Buy_and_Sell_Stock_with_Cooldown_309().new Solution()
				.maxProfit(new int[]{6,1,3,2,4,7}));
		//10
		System.out.println(new Best_Time_to_Buy_and_Sell_Stock_with_Cooldown_309().new Solution()
				.maxProfit(new int[]{2,1,4,5,2,9,7}));
		//7
		System.out.println(new Best_Time_to_Buy_and_Sell_Stock_with_Cooldown_309().new Solution()
				.maxProfit(new int[]{3,2,6,5,0,3}));
		//6
		System.out.println(new Best_Time_to_Buy_and_Sell_Stock_with_Cooldown_309().new Solution()
				.maxProfit(new int[]{1,7,2,4}));
		//15
		System.out.println(new Best_Time_to_Buy_and_Sell_Stock_with_Cooldown_309().new Solution()
				.maxProfit(new int[]{2,6,8,7,8,7,9,4,1,2,4,5,8}));
	}

}
