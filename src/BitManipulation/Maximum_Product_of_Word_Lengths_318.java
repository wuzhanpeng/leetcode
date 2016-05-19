package BitManipulation;

public class Maximum_Product_of_Word_Lengths_318 {
	
	public class Solution {
	    public int maxProduct(String[] words) {
	        int max = 0;
	        int[] nums = new int[words.length], lens = new int[words.length];
	        covert2Integer(words, nums, lens);
	        for (int i = 0; i < words.length; ++ i) {
	        	for (int j = i + 1; j < words.length; ++ j) {
		        	if (0 == (nums[i] & nums[j])) {
		        		int product = lens[i] * lens[j];
		        		if (product > max) { max = product; }
		        	}
		        }
	        }
	        return max;
	    }
	    private void covert2Integer(String[] words, int[] nums, int[] lens) {
			for (int i = 0; i < words.length; ++ i) {
				lens[i] = words[i].length();
				for (int len = lens[i] - 1; len >= 0; -- len) {
					nums[i] |= 1 << (words[i].charAt(len) - 'a'); 
				}
			}
		}
	}

	public static void main(String[] args) {
		System.out.println(new Maximum_Product_of_Word_Lengths_318().new Solution()
				.maxProduct(new String[]{"abcw", "baz", "foo", "bar", "xtfn", "abcdef"}));
		System.out.println(new Maximum_Product_of_Word_Lengths_318().new Solution()
				.maxProduct(new String[]{"a", "ab", "abc", "d", "cd", "bcd", "abcd"}));
		System.out.println(new Maximum_Product_of_Word_Lengths_318().new Solution()
				.maxProduct(new String[]{"a", "aa", "aaa", "aaaa"}));
	}

}
