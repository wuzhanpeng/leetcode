package Strategy;

public class Nim_Game_292 {
	
	/** Solution class */
	public class Solution {
	    public boolean canWinNim(int n) {
	    	if (0 == n%4) {
				return false;
			} else {
				return true;
			}
	    }
	}
	
	public static void main(String[] args) {
		Nim_Game_292.Solution test = new Nim_Game_292().new Solution();
		System.out.println(test.canWinNim(4));
	}

}
