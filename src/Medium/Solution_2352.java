package Medium;

// https://leetcode.com/problems/equal-row-and-column-pairs/?envType=study-plan-v2&envId=leetcode-75
// Equal Row and Column Pairs
public class Solution_2352 {
    public int equalPairs(int[][] grid) {
        int ans = 0;
        for(int r =0; r < grid.length;r++){
            for (int c = 0; c < grid.length;c++){
                for (int i = 0;i < grid.length;i++){
                    if(grid[r][i] != grid[i][c]){
                        break;
                    }
                    if(i == grid.length-1){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}
