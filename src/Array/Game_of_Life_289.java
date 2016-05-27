package Array;

//import leetcode.util.Debug;

public class Game_of_Life_289 {
	
	public class Solution {
		// for loop => recursion
	    public void gameOfLife(int[][] board) {
	    	row(board, 0);
	    }
	    private void row(int[][] board, int i) {
			if (i < board.length) {
				col(board, i, 0);
			}
		}
	    private void col(int[][] board, int i, int j) {
			if (j == board[0].length) {
				row(board, i + 1);
				return;
			}
			int[] cnt = count(i, j, board);
			col(board, i, j + 1);
			if (board[i][j] == 1 && (cnt[1] < 2 || cnt[1] > 3)) { board[i][j] = 0; }
			if (board[i][j] == 0 && cnt[1] == 3) { board[i][j] = 1; }
		}
	    public int[] count(int i, int j, int[][] board) {
			int[] counter = new int[2];
			int rs = 0 == i ? 0 : i - 1, cs = 0 == j ? 0 : j - 1;
			int re = board.length - 1 == i ? i : i + 1, ce = board[0].length - 1 == j ? j : j + 1;
			for (int m = rs; m <= re; ++ m) {
				for (int n = cs; n <= ce; ++ n) {
					++ counter[board[m][n]];
				}
			}
			-- counter[board[i][j]];
			return counter;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Debug.printArray(new Game_of_Life_289().new Solution().count(3, 0, new int[][]{{1,0,1,1},{0,1,1,0},{1,1,0,0},{0,0,1,1}}));
		new Game_of_Life_289().new Solution().gameOfLife(new int[][]{{1,0,1,1},{0,1,1,0},{1,1,0,0},{0,0,1,1}});
	}

}
