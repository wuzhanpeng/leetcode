package HashTable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class Valid_Sudoku_36 {
	
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
//		public class CharSet {
//			public Integer size;
//			public HashSet<Character> union;
//			public CharSet() {
//				this.union = new HashSet<Character>();
//				size = 0;
//			}
//			public CharSet(HashSet<Character> union) {
//				this.union = union;
//				size = 1;
//			}
//			public boolean add(CharSet cs) {
//				union.addAll(cs.union);
//				size += cs.size;
//				if (size > union.size()) { return false; }
//				return true;
//			}
//		}
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
		private Set<List<Integer[]>> getExistKeySet(Set<List<Integer[]>> keySet, Integer[] val) {
			HashSet<List<Integer[]>> set = new HashSet<List<Integer[]>>();
			for (List<Integer[]> keys : keySet) {
				for (Integer[] key : keys) {
					if (key[0] == val[0] ||
						key[1] == val[1] ||
						key[2] == val[2]) {
						set.add(keys);
						break;
					}
				}
			}
			return set;
		}
	    public boolean isValidSudoku(char[][] board) {
	        
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
		        		if (row.get(i).contains(c)) { return false; }
		        		row.get(i).add(c);
		        		if (col.get(j).contains(c)) { return false; }
		        		col.get(j).add(c);
		        		Integer idx = getSubgridNum(i, j);
		        		if (sub.get(idx).contains(c)) { return false; }
		        		sub.get(idx).add(c);
	        		}
	        	}
	        }
	        for (Integer i = 0; i < 9; ++ i) {
	        	for (Integer j = 0; j < 9; ++ j) {
	        		if ('.' == board[i][j]) {
	        			Integer k = getSubgridNum(i, j);
	        			HashSet<Character> res = getAlternativeCharacter(i, j, k);
	        			if (res.isEmpty()) { return false; }
	        			cells.add(new EmptyCell(i, j, k, res));
//	        			System.out.println(res.toString());
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
	        if (cells.isEmpty()) { return true; }
	        else {
	        	HashMap<List<Integer[]>, HashSet<Character>> parts = new HashMap<List<Integer[]>, HashSet<Character>>();
	        	while (!cells.isEmpty()) {
	        		EmptyCell cell = cells.poll();
	        		Integer[] key = new Integer[]{cell.i, cell.j, cell.k};
	        		Set<List<Integer[]>> existKey = getExistKeySet(parts.keySet(), key);
	        		if (parts.isEmpty() || existKey.isEmpty()) {
	        			LinkedList<Integer[]> linkedList = new LinkedList<Integer[]>();
	        			linkedList.add(key);
	        			parts.put(linkedList, cell.set);
//	        			System.out.printf("Put (%d,%d,%d) %s\n",cell.i, cell.j, cell.k, cell.set.toString());
	        		} else {
	        			List<Integer[]> pk = new LinkedList<Integer[]>();
	        			HashSet<Character> ts = new HashSet<Character>();
	        			pk.add(key); ts.addAll(cell.set);
	        			for (List<Integer[]> ck : existKey) { 
	        				ts.addAll(parts.remove(ck));
	        				pk.addAll(ck);
	        				if (pk.size() > ts.size()) { return false; }
//	        				System.out.printf("%d,%d\n", pk.size(), ts.size());
	        			}
	        			parts.put(pk, ts);
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
		
		String[] s = new String[]{"..9748...","7........",".2.1.9...","..7...24.",".64.1.59.",".98...3..","...8.3.2.","........6","...2759.."};
		char[][] board4 = new char[9][9];
		for (int i = 0; i < 9; ++ i) {
			for (int j = 0; j < 9; ++ j) {
				board4[i][j] = s[i].charAt(j);
			}
		}
			
		System.out.println(new Valid_Sudoku_36().new Solution().isValidSudoku(board4));
	}

}
