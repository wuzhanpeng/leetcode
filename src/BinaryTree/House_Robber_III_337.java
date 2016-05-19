package BinaryTree;

import leetcode.util.TreeNode;

public class House_Robber_III_337 {
	
	public class Solution {
	    public int rob(TreeNode root) {
	    	if (null == root) { return 0; }
	        return getMaxProfit(root)[1];
	    }
	    private int[] getMaxProfit(TreeNode node) {
	    	// reach the leaf node
			if (null == node.left && null == node.right) {
				return new int[]{0, node.val};
			}
			int[] lt_profit = null == node.left ? new int[]{0,0} : getMaxProfit(node.left);
			int[] rt_profit = null == node.right ? new int[]{0,0} : getMaxProfit(node.right);
			int prev = lt_profit[0] + rt_profit[0], max = lt_profit[1] + rt_profit[1];
			return new int[]{
					max,
					Math.max(max, prev + node.val)
			};
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
