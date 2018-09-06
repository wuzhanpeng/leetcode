package DynamicProgramming;

/**
 * Created by Zhanpeng Wu on 2018/9/6.
 */
public class Scramble_String_87 {
    class Solution {
        public boolean isScramble(String s1, String s2) {
            int l1 = s1.length(), l2 = s2.length();
            if (l1 != l2)
                return false;

            if (s1.equals(s2))
                return true;

            // lowercase supported only
            int[] charMap = new int[26];
            for (char c : s1.toCharArray()) {
                charMap[c - 'a']++;
            }
            for (char c : s2.toCharArray()) {
                charMap[c - 'a']--;
            }
            for (int c : charMap) {
                if (c != 0) {
                    return false;
                }
            }

            // main loop
            for (int i = 1; i < l1; i++) {
                if (isScramble(s1.substring(0, i), s2.substring(0, i)) &&
                        isScramble(s1.substring(i), s2.substring(i)))
                    return true;
                if (isScramble(s1.substring(0, i), s2.substring(l2 - i)) &&
                        isScramble(s1.substring(i), s2.substring(0, l2 - i)))
                    return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
//        System.out.println(new Scramble_String_87().new Solution().isScramble("great", "rgeat"));
        System.out.println(new Scramble_String_87().new Solution().isScramble("abb", "bba"));
    }
}
