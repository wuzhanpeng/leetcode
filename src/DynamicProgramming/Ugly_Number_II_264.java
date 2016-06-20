package DynamicProgramming;

//import java.util.LinkedList;

public class Ugly_Number_II_264 {
	
//	public class Solution {
//	    public int nthUglyNumber(int n) {
//	    	LinkedList<Integer> l1 = new LinkedList<>();
//	    	LinkedList<Integer> l2 = new LinkedList<>();
//	    	LinkedList<Integer> l3 = new LinkedList<>();
//	    	l1.add(1); l2.add(1); l3.add(1);
//	    	
//	    	int ans = 0;
//	    	for (int i = 0; i < n; ++ i) {
//	    		ans = Math.min( Math.min(l1.get(0), l2.get(0)), l3.get(0) );
//	    		if (ans == l1.get(0)) { l1.removeFirst(); }
//	    		if (ans == l2.get(0)) { l2.removeFirst(); }
//	    		if (ans == l3.get(0)) { l3.removeFirst(); }
//	    		l1.add(ans * 2); l2.add(ans * 3); l3.add(ans * 5);
//	    	}
//	    	return ans;
//	    }
//	}
	
	public class Solution {
	    public int nthUglyNumber(int n) {
	    	int[] aux = new int[n];
	    	int p2 = 0, p3 = 0, p5 = 0;
	    	aux[0] = 1;
	    	for (int i = 1; i < n; ++ i) {
	    		aux[i] = Math.min( Math.min(aux[p2] * 2, aux[p3] * 3), aux[p5] * 5);
	    		if (aux[i] == aux[p2] * 2) { ++ p2; }
	    		if (aux[i] == aux[p3] * 3) { ++ p3; }
	    		if (aux[i] == aux[p5] * 5) { ++ p5; }
	    	}
	    	return aux[n - 1];
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
