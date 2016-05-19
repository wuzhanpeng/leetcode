package Stack;

import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Stack;

public class Min_Stack_155 {
	
	public class MinStack {
		
		private PriorityQueue<Pair> pQueue;
		private Stack<Pair> stack;
		private HashSet<Integer> delete;
		private int idx;
		
		public class Pair {
			public int idx;
			public long num;
			public Pair(int idx, int num) {
				this.idx = idx;
				this.num = num;
			}
		}

	    /** initialize your data structure here. */
	    public MinStack() {
	    	this.idx = 0;
	    	this.stack = new Stack<Pair>();
	    	this.delete = new HashSet<Integer>();
	        this.pQueue = new PriorityQueue<Pair>(new Comparator<Pair>() {

				@Override
				public int compare(Pair o1, Pair o2) {
					return Long.compare(o1.num, o2.num);
				}
			});
	    }
	    
	    public void push(int x) {
	    	Pair p = new Pair(idx ++, x);
	        pQueue.add(p);
	        stack.push(p);
	    }
	    
	    public void pop() {
	    	delete.add(stack.pop().idx);
	    }
	    
	    public int top() {
	        return (int) stack.peek().num;
	    }
	    
	    public int getMin() {
	    	while (delete.contains(pQueue.peek().idx)) { pQueue.poll(); }
	        return (int) pQueue.peek().num;
	    }
	}

	public static void main(String[] args) {
		MinStack minStack = new Min_Stack_155().new MinStack();
		minStack.push(0);
		minStack.push(0);
		minStack.push(1);
		System.out.println(minStack.top());
		minStack.pop();
		System.out.println(minStack.getMin());
		minStack.pop();
		System.out.println(minStack.getMin());
		minStack.pop();
		
		minStack.push(1);
		System.out.println(minStack.top());
		System.out.println(minStack.getMin());
		minStack.push(-2);
		System.out.println(minStack.top());
		System.out.println(minStack.getMin());
		minStack.pop();
		System.out.println(minStack.getMin());
	}

}
