package Medium;

public class Solution_62 {
    public int uniquePaths(int m, int n) {
        long[][] arr = new long[m][n];
        for(int i = 0; i < m;i++){
            for(int j = 0; j < n;j++){
                if(i == 0 || j == 0)
                    arr[i][j] = 1;
                else
                    arr[i][j] = arr[i][j-1] + arr[i-1][j];
            }
        }
        return (int) arr[m-1][n-1];
    }
}
