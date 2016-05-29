package Strategy;

import java.util.Iterator;

public class Peeking_Iterator_284 {
	
	// Java Iterator interface reference:
	// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
	class PeekingIterator implements Iterator<Integer> {

		private Iterator<Integer> iterator;
		private Integer next;
		private boolean hasPeeked = false;
		public PeekingIterator(Iterator<Integer> iterator) {
		    // initialize any member here.
		    this.iterator = iterator;
		}

	    // Returns the next element in the iteration without advancing the iterator.
		public Integer peek() {
			if (!hasPeeked) {
				next = iterator.next();
				hasPeeked = true;
			}
	        return next;
		}

		// hasNext() and next() should behave the same as in the Iterator interface.
		// Override them if needed.
		@Override
		public Integer next() {
			if (hasPeeked) {
				hasPeeked = false;
				return next;
			}
			next = iterator.next();
			return next;
		}

		@Override
		public boolean hasNext() {
			return hasPeeked || iterator.hasNext();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
