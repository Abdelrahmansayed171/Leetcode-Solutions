package Top_Interview_150;
import java.util.*;

// 64. Minimum Path Sum
// Medium

public class Minimum_Path_Sum {
    public int minPathSum(int[][] grid) {
        int[] dp = new int[grid[0].length+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[dp.length-2] = 0;
        for(int i = grid.length-1 ;i >= 0 ;i --){
            for(int j = grid[0].length-1; j >= 0; j--){
                grid[i][j] += Math.min(dp[j], dp[j+1]);
                dp[j] = grid[i][j];
            }
        }
        return grid[0][0];
    }
}
