package HashTable;

public class Bulls_and_Cows_299 {
	
	public class Solution {
	    public String getHint(String secret, String guess) {
	        int bulls = 0, cows = 0;
	        int[] aux1 = new int[10];
	        int[] aux2 = new int[10];
	        for (int i = 0; i < secret.length(); ++ i) {
	        	if (secret.charAt(i) == guess.charAt(i)) { ++ bulls; } 
	        	else {
	        		++ aux1[secret.charAt(i) - '0'];
	        		++ aux2[guess.charAt(i) - '0'];
	        	}
	        }
	        for (int i = 0; i < 10; ++ i) {
	        	cows += Math.min(aux1[i], aux2[i]);
	        }
	        return new StringBuilder(bulls+"A"+cows+"B").toString();
	    }
	}

	public static void main(String[] args) {
//		System.out.println(new Bulls_and_Cows_299().new Solution().getHint("1807", "7810"));
		System.out.println(new Bulls_and_Cows_299().new Solution().getHint("1123", "0111"));
	}

}
