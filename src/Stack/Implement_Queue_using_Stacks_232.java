package Stack;

import java.util.Stack;

public class Implement_Queue_using_Stacks_232 {
	
	class MyQueue {
		
		private Stack<Integer> stack = new Stack<Integer>();
		
	    // Push element x to the back of queue.
	    public void push(int x) {
	    	int[] nums = new int[stack.size()];
	    	for (int i = stack.size() - 1; i >= 0; -- i) {
	    		nums[i] = stack.pop();
	    	}
	    	stack.push(x);
	    	for (int i : nums) {
	    		stack.add(i);
	    	}
	    }

	    // Removes the element from in front of queue.
	    public void pop() {
	        stack.pop();
	    }

	    // Get the front element.
	    public int peek() {
	        return stack.peek();
	    }

	    // Return whether the queue is empty.
	    public boolean empty() {
	        return stack.empty();
	    }
	}

	public static void main(String[] args) {
	}

}
