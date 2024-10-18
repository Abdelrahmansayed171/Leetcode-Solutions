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

    /*
    public int equalPairs(int[][] grid) {
        HashMap<String,Integer> hm = new HashMap<>();
        int n = grid.length;
        for(int i=0;i<n;++i){
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<n;++j){
                sb.append('0'+grid[i][j]);
            }
            String s = sb.toString();
            hm.put(s,hm.getOrDefault(s,0)+1);
        }
        int ans=0;
        for(int i=0;i<n;++i){
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<n;++j){
                sb.append('0'+grid[j][i]);
            }
            String s = sb.toString();
            ans += hm.getOrDefault(s,0);
        }
        return ans;
    }
    */
}
