package SegmentTree;

public class Range_Sum_Query_303 {
	
	public class NumArray {
		
		private int[] nums;
		public int[] buf;

	    public NumArray(int[] nums) {
	        this.nums = nums;
	        if (nums.length == 0) return; // case: []
	        this.buf = new int
//	        		[(int) (Math.pow(2, Math.ceil(Math.log(nums.length) / Math.log(2))) - 1)]; // case: 2n - 1
//	        		[(int) (Math.pow(2, Math.ceil(Math.log(nums.length) / Math.log(2))))]; // case: [-1] Range(0, 0)
	        		[(int) (Math.pow(2, Math.ceil(Math.log(nums.length) / Math.log(2))) - 1)];
	        
	        // initial
	        for (int i = 0; i < buf.length; ++i) {
	        	buf[i] = Integer.MAX_VALUE;
	        }
	    }
	    
	    private int recursiveCreate(int buf_idx, int l, int r) {
			if (l == r) {
				return nums[l];
			}
			int mid = l + r >> 1;
	        return buf[buf_idx] = recursiveCreate(2 * buf_idx + 1, l, mid)
	        		+ recursiveCreate(2 * buf_idx + 2, mid + 1, r);
		}
	    
	    private int recursiveSum(int l, int r, int cl, int cr, int buf_idx) {
	    	
	    	int mid = cl + cr >> 1;
	    	if (l <= cl && r >= cr) {
//	    		System.out.printf("buf_idx: %d\n", buf_idx);
//	    		System.out.printf("buf_len: %d\n", buf.length);
//	    		System.out.printf("%d - %d\n", cl, cr);
	    		if (cl == cr) return nums[cl]; // case: [1,4,-6], sumRange(1,2)
	    		if (buf[buf_idx] == Integer.MAX_VALUE) {
	    			buf[buf_idx] = recursiveCreate(buf_idx, cl, cr);
	    		}
	    		return buf[buf_idx];
			}
	    	
	    	if (r <= mid) {
				return recursiveSum(l, r, cl, mid, 2 * buf_idx + 1);
			} else if (l >= mid + 1) {
				return recursiveSum(l, r, mid + 1, cr, 2 * buf_idx + 2);
			} else {
				return recursiveSum(l, mid, cl, mid, 2 * buf_idx + 1)
					 + recursiveSum(mid + 1, r, mid + 1, cr, 2 * buf_idx + 2);
			}
	    	
//	    	return recursiveSum(l, mid, cl, mid, 2 * buf_idx + 1)
//					 + recursiveSum(mid + 1, r, mid + 1, cr, 2 * buf_idx + 2);
		}

	    public int sumRange(int i, int j) {
	    	if (i == j) { // case: Range(0, 0) | Range(1, 1)
				return nums[i];
			}
	    	return recursiveSum(i, j, 0, nums.length - 1, 0);
	    }
	}

	public static void main(String[] args) {
		Range_Sum_Query_303.NumArray test = 
				new Range_Sum_Query_303().new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
//				new Range_Sum_Query_303().new NumArray(new int[]{});
//				new Range_Sum_Query_303().new NumArray(new int[]{-1});
//				new Range_Sum_Query_303().new NumArray(new int[]{-4, -5});
//				new Range_Sum_Query_303().new NumArray(new int[]{1, 4, -6});
		System.out.println(test.sumRange(0, 2));
//		System.out.println(test.sumRange(0, 5));
//		for (int x: test.buf) {
//			System.out.println(x);
//		}
	}

}
