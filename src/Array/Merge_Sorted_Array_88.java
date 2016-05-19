package Array;

public class Merge_Sorted_Array_88 {
	
	public class Solution {
	    public void merge(int[] nums1, int m, int[] nums2, int n) {
	    	if (0 == n) { return; }
			if (0 < m) {
				for (int i = 0; i < m; ++ i) {
					if (nums1[i] > nums2[0]) {
						int aux = nums1[i];
						nums1[i] = nums2[0];
						int j = 1;
						while (j < n && aux > nums2[j]) {
							nums2[j - 1] = nums2[j];
							++ j;
						}
						nums2[j - 1] = aux;
					}
				}
			}
	        for (int x : nums2) {
	        	nums1[m ++] = x;
	        }
	    }
	}

	public static void main(String[] args) {
		int[] nums1 = new int[]{1,2,4,4,4,5,9,0,0,0};
		int[] nums2 = new int[]{0,7,8};
		new Merge_Sorted_Array_88().new Solution().merge(nums1, 7, nums2, 3);
		for (int x:nums1) {System.out.printf("%d ", x);}
	}

}
