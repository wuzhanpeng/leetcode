package HashTable;

import java.util.HashMap;
import java.util.HashSet;

public class Valid_Sudoku_36_2 {
	
	public class Solution {
		private HashSet<Character> all = new HashSet<Character>();
		HashMap<Integer, HashSet<Character>> row = new HashMap<Integer, HashSet<Character>>();
        HashMap<Integer, HashSet<Character>> col = new HashMap<Integer, HashSet<Character>>();
        HashMap<Integer, HashSet<Character>> sub = new HashMap<Integer, HashSet<Character>>();
		public Solution() {
			for (int i = 0; i < 9; ++ i) {
				all.add((char) ('1' + i));
			}
			for (Integer i = 0; i < 9; ++ i) {
	        	row.put(i, new HashSet<Character>());
	        	col.put(i, new HashSet<Character>());
	        	sub.put(i, new HashSet<Character>());
	        }
		}
		private Integer getSubgridNum(Integer i, Integer j) {
			i /= 3; j /= 3;
			return i*3 + j;
		}
	    public boolean isValidSudoku(char[][] board) {
	        
	        for (Integer i = 0; i < 9; ++ i) {
	        	row.get(i).clear();
	        	col.get(i).clear();
	        	sub.get(i).clear();
	        }
	        for (Integer i = 0; i < 9; ++ i) {
	        	for (Integer j = 0; j < 9; ++ j) {
	        		Character c = board[i][j];
	        		if ('.' != c.charValue()) {
		        		if (row.get(i).contains(c)) { 
		        			System.out.printf("Row - (%d,%d)\n", i,j);
		        			return false; 
		        		}
		        		row.get(i).add(c);
		        		if (col.get(j).contains(c)) { 
		        			System.out.printf("Col - (%d,%d)\n", i,j);
		        			return false; 
		        		}
		        		col.get(j).add(c);
		        		Integer idx = getSubgridNum(i, j);
		        		if (sub.get(idx).contains(c)) { 
		        			System.out.printf("Subgrid - (%d,%d,%d)\n", i,j,idx);
		        			return false; 
		        		}
		        		sub.get(idx).add(c);
	        		}
	        	}
	        }
	        return true;
	    }
	}

	public static void main(String[] args) {
		// test data
//		char[][] board = new char[][]{
//			{'5','3','.','.','7','.','.','.','.'}, 
//			{'6','.','.','1','9','5','.','.','.'}, 
//			{'.','9','8','.','.','.','.','6','.'}, 
//			{'8','.','.','.','6','.','.','.','3'}, 
//			{'4','.','.','8','.','3','.','.','1'}, 
//			{'7','.','.','.','2','.','.','.','6'}, 
//			{'.','6','.','.','.','.','2','8','.'}, 
//			{'.','.','.','4','1','9','.','.','5'}, 
//			{'.','.','.','.','8','.','.','7','9'}};
			
//		char[][] board2 = new char[][]{
//			{'5','3','.','.','7','.','.','.','.'}, 
//			{'6','.','.','1','9','5','.','.','.'}, 
//			{'.','9','8','.','.','.','.','6','.'}, 
//			{'8','.','.','.','6','.','.','.','3'}, 
//			{'4','.','.','8','.','3','.','.','2'}, 
//			{'7','.','.','.','2','.','.','.','6'}, 
//			{'.','6','.','.','.','.','2','8','.'}, 
//			{'.','.','.','4','1','9','.','.','5'}, 
//			{'.','.','.','.','8','.','.','7','9'}};
		
//		char[][] board3 = new char[][]{
//			{'.','8','7','6','5','4','3','2','1'}, 
//			{'2','.','.','.','.','.','.','.','.'}, 
//			{'3','.','.','.','.','.','.','.','.'}, 
//			{'4','.','.','.','.','.','.','.','.'}, 
//			{'5','.','.','.','.','.','.','.','.'}, 
//			{'6','.','.','.','.','.','.','.','.'}, 
//			{'7','.','.','.','.','.','.','.','.'}, 
//			{'8','.','.','.','.','.','.','.','.'}, 
//			{'9','.','.','.','.','.','.','.','.'}};
		
//		String[] s = new String[]{"..9748...","7........",".2.1.9...","..7...24.",".64.1.59.",".98...3..","...8.3.2.","........6","...2759.."};
		String[] s = new String[]{"619748115","715632489","423159673","357986241","264317598","198524367","911863724","572491836","846275913"};
		char[][] board4 = new char[9][9];
		for (int i = 0; i < 9; ++ i) {
			for (int j = 0; j < 9; ++ j) {
				board4[i][j] = s[i].charAt(j);
			}
		}
			
		System.out.println(new Valid_Sudoku_36_2().new Solution().isValidSudoku(board4));
	}

}
