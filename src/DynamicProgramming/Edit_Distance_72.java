package DynamicProgramming;

/**
 * Created by Zhanpeng Wu on 2018/9/6.
 */
public class Edit_Distance_72 {
    class Solution {
        public int minDistance(String word1, String word2) {
            int n = word1.length(), m = word2.length();
            int[][] dp = new int[n + 1][];
            for (int i = 0; i <= n; i++) {
                dp[i] = new int[m + 1];
            }

            // init
            for (int i = 0; i <= m; i++) {
                // insert opts
                dp[0][i] = i;
            }
            for (int i = 0; i <= n; i++) {
                // delete opts
                dp[i][0] = i;
            }

            // dp
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                        dp[i][j] = dp[i - 1][j - 1];
                    } else {
                        dp[i][j] = Math.min(Math.min(dp[i][j - 1], dp[i - 1][j]), dp[i - 1][j - 1]) + 1;
                    }
                }
            }

            return dp[n][m];
        }
    }

    public static void main(String[] args) {
        System.out.println(new Edit_Distance_72().new Solution().minDistance("horse", "ros"));
        System.out.println(new Edit_Distance_72().new Solution().minDistance("intention", "execution"));
    }
}
