package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class Implement_Stack_using_Queues_225 {
	
	class MyStack {
		private Queue<Integer> queue = new LinkedList<Integer>();
	    // Push element x onto stack.
	    public void push(int x) {
	        // aux queue
	    	Queue<Integer> aux = new LinkedList<Integer>();
	    	aux.add(x);
	    	while (!queue.isEmpty()) {
	    		aux.add(queue.poll());
	    	}
	    	queue = aux;
	    }

	    // Removes the element on top of the stack.
	    public void pop() {
	        queue.poll();
	    }

	    // Get the top element.
	    public int top() {
	        return queue.peek();
	    }

	    // Return whether the stack is empty.
	    public boolean empty() {
	        return queue.isEmpty();
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
