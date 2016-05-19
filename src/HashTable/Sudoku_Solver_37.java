package HashTable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Sudoku_Solver_37 {
	
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
		public class EmptyCell implements Comparable<EmptyCell> {
			public Integer i;
			public Integer j;
			public Integer k;
			public int pos = 0;
			public Character[] as;
			public HashSet<Character> set;
			public EmptyCell(Integer i, Integer j, Integer k, HashSet<Character> set) {
				this.i = i; this.j = j; this.k = k;
				this.set = set;
			}
			@Override
			public int compareTo(EmptyCell o) {
				return this.set.size() - o.set.size();
			}
		}
		public class Status {
			public int i,j,k;
			public Character c;
		}
		private Integer getSubgridNum(Integer i, Integer j) {
			i /= 3; j /= 3;
			return i*3 + j;
		}
		private HashSet<Character> getAlternativeCharacter(Integer i, Integer j, Integer k) {
			HashSet<Character> res = new HashSet<Character>();
	        HashSet<Character> sum = new HashSet<Character>();
			res.addAll(all);
			sum.addAll(row.get(i));
			sum.addAll(col.get(j));
			sum.addAll(sub.get(k));
			res.removeAll(sum);
			return res;
		}
		private void updateStatus(EmptyCell cell) {
			cell.set = getAlternativeCharacter(cell.i, cell.j, cell.k);
			cell.as = new Character[cell.set.size()];
			int i = 0;
			for (Character x : cell.set) {
				cell.as[i ++] = x;
			}
		}
		private void fillCells(char[][] board, EmptyCell[] cs) {
			for (EmptyCell ec : cs) {
//				System.out.printf("(%d,%d,%d) - %s\n", ec.i, ec.j, ec.k, ec.set.toString());
				board[ec.i][ec.j] = ec.as[ec.pos];
			}
		}
		private void backtracking(EmptyCell[] cells, int len) {
			int statusIdx = 0;
			while (statusIdx < len) {
				EmptyCell iCell = cells[statusIdx];
				Character ch;
				if (0 == iCell.set.size()) { 
//					System.out.printf("Stop status - Idx:%d (%d,%d,%d) pos:%d %s\n", statusIdx,iCell.i,iCell.j,iCell.k, iCell.pos,iCell.set.toString());
					EmptyCell prev;
					do {						
						prev = cells[-- statusIdx];
						cells[statusIdx + 1].pos = 0;
						ch = prev.as[prev.pos];
						row.get(prev.i).remove(ch);
						col.get(prev.j).remove(ch);
						sub.get(prev.k).remove(ch);
//						updateAll(cells);
//						updateStatus(prev);
//						System.out.printf("Pop status - Idx:%d (%d,%d,%d) pos:%d %s\n", statusIdx,prev.i,prev.j,prev.k, prev.pos,prev.set.toString());
					} while (prev.pos + 1 >= prev.set.size());
					++ prev.pos;
				} else {
//					System.out.printf("Push status - Idx:%d (%d,%d,%d) pos:%d %s\n", statusIdx,iCell.i,iCell.j,iCell.k, iCell.pos,iCell.set.toString());
					ch = iCell.as[iCell.pos];
//					while (!iCell.set.contains(ch)) {
//						ch = iCell.as[++ iCell.pos];
//					}
					row.get(iCell.i).add(ch);
					col.get(iCell.j).add(ch);
					sub.get(iCell.k).add(ch);	
					if (statusIdx + 1 < len) { updateStatus(cells[statusIdx + 1]); }		
					++ statusIdx;
				}
			}
		}
		public void solveSudoku(char[][] board) {
	        
	        for (Integer i = 0; i < 9; ++ i) {
	        	row.get(i).clear();
	        	col.get(i).clear();
	        	sub.get(i).clear();
	        }
			PriorityQueue<EmptyCell> cells = new PriorityQueue<>(100);
	        for (Integer i = 0; i < 9; ++ i) {
	        	for (Integer j = 0; j < 9; ++ j) {
	        		Character c = board[i][j];
	        		if ('.' != c.charValue()) {
		        		row.get(i).add(c);
		        		col.get(j).add(c);
		        		Integer k = getSubgridNum(i, j);
		        		sub.get(k).add(c);
	        		}
	        	}
	        }
	        for (Integer i = 0; i < 9; ++ i) {
	        	for (Integer j = 0; j < 9; ++ j) {
	        		if ('.' == board[i][j]) {
	        			Integer k = getSubgridNum(i, j);
	        			HashSet<Character> res = getAlternativeCharacter(i, j, k);
	        			cells.add(new EmptyCell(i, j, k, res));
	        		}
	        	}
	        }
	        // pick out	    
//	        int acc = cells.size(); System.out.printf("----%d----\n", acc);
	        while (!cells.isEmpty() && 1 == cells.peek().set.size()) {
				PriorityQueue<EmptyCell> alter = new PriorityQueue<>(100);
		        while (!cells.isEmpty()) {
		        	EmptyCell cell = cells.poll();
		        	if (1 == cell.set.size()) {
//		        		System.out.printf("(%d,%d) %s\n",cell.i, cell.j, cell.set.toString()); -- acc;
		        		Character ch = null;
		        		for (Character c : cell.set) { ch = c; }
		        		board[cell.i][cell.j] = ch.charValue();
		        		row.get(cell.i).addAll(cell.set);
		        		col.get(cell.j).addAll(cell.set);
		        		sub.get(cell.k).addAll(cell.set);
		        	} else {		        		
		        		cell.set = getAlternativeCharacter(cell.i, cell.j, cell.k);
		        		alter.add(cell);
		        	}
		        }
		        cells = alter;
//		        System.out.printf("----%d----\n", acc);
	        }
	        if (!cells.isEmpty()) {
	        	EmptyCell[] cs = new EmptyCell[cells.size()];
	        	for (int i = 0; !cells.isEmpty(); ++ i) {
	        		cs[i] = cells.poll();
//	        		System.out.printf("(%d,%d,%d) - %s\n", cs[i].i, cs[i].j, cs[i].k, cs[i].set.toString());
	        		cs[i].as = new Character[cs[i].set.size()];
	        		int j = 0;
	        		for (Character x : cs[i].set) {
	        			cs[i].as[j ++] = x;
	        		}
	        	}
	        	backtracking(cs, cs.length);
	        	fillCells(board, cs);
	        }
	    }
	}

	public static void main(String[] args) {
		
		String[] s = new String[]{"..9748...","7........",".2.1.9...","..7...24.",".64.1.59.",".98...3..","...8.3.2.","........6","...2759.."};
//		String[] s = new String[]{"...2...63","3....54.1","..1..398.",".......9.","...538...",".3.......",".263..5..","5.37....8","47...1..."};
//		String[] s = new String[]{"..9748...","7........",".2.1.9...","..7...24.",".64.1.59.",".98...3..","...8.3.2.","........6","...2759.."};
		char[][] board = new char[9][9];
		for (int i = 0; i < 9; ++ i) {
			for (int j = 0; j < 9; ++ j) {
				board[i][j] = s[i].charAt(j);
			}
		}
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
			
		new Sudoku_Solver_37().new Solution().solveSudoku(board);
		System.out.println(new Valid_Sudoku_36_2().new Solution().isValidSudoku(board));
		for (int i = 0; i < 9; ++ i) {
			for (int j = 0; j < 9; ++ j) {
				System.out.printf("%c ", board[i][j]);
			}
			System.out.println();
		}
	}

}
