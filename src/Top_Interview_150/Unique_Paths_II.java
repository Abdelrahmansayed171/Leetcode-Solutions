package Top_Interview_150;
import java.util.*;

// 63. Unique Paths II
// Medium

public class Unique_Paths_II {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid[0][0] == 1)
            return 0;
        int[] dp = new int[obstacleGrid[0].length+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[dp.length-2] = 1;
        for(int i = obstacleGrid.length-1;i >=0; i--){
            for(int j = obstacleGrid[0].length-1; j >= 0; j--){
                if(obstacleGrid[i][j] == 1) {
                    dp[j] = Integer.MAX_VALUE;
                    continue;
                }
                if(dp[j] != Integer.MAX_VALUE) {
                    obstacleGrid[i][j] += dp[j];
                    dp[j] = obstacleGrid[i][j];
                }
                if(dp[j+1] != Integer.MAX_VALUE) {
                    obstacleGrid[i][j] += dp[j + 1];
                    dp[j] = obstacleGrid[i][j];
                }
            }
        }
        return obstacleGrid[0][0];
    }
}
