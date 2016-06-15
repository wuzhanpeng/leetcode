package Backtracking;

import java.util.LinkedList;
import java.util.List;

import leetcode.util.TreeNode;

public class Unique_Binary_Search_Trees_II_95 {
	
	public class Solution {
	    public List<TreeNode> generateTrees(int n) {
	    	if (0 == n) { return new LinkedList<>(); }
	        return backtracking(1, n);
	    }
	    private List<TreeNode> backtracking(int beg, int end) {
			List<TreeNode> ans = new LinkedList<>();
			if (end < beg) {
				ans.add(null);
				return ans;
			}
			for (int i = beg; i <= end; ++ i) {
				List<TreeNode> l_subTrees = backtracking(beg, i - 1);
				List<TreeNode> r_subTrees = backtracking(i + 1, end);
				
				for (TreeNode l : l_subTrees) {
					for (TreeNode r : r_subTrees) {
						TreeNode node = new TreeNode(i);
						node.left = l; node.right = r;
						ans.add(node);
					}
				}
			}
			return ans;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
