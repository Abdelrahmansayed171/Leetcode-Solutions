package Medium;

public class Solution_72 {
    public int minDistance(String word1, String word2) {
        int n = word1.length(), m = word2.length();
        int[][] dp = new int[n+1][m+1];
        for(int i = n; i >= 0;i--){
            for(int j = m ; j >= 0;j--){
                if(i == n)
                    dp[i][j] = m - j;
                else if(j == m)
                    dp[i][j] = n - i;
                else {
                    if (word1.charAt(i) == word2.charAt(j))
                        dp[i][j] = dp[i + 1][j + 1];
                    else
                        dp[i][j] = Math.min(dp[i + 1][j + 1], Math.min(dp[i + 1][j], dp[i][j + 1])) + 1;
                }
            }
        }
        return dp[0][0];
    }
}
