package Medium;

import java.util.*;

public class Solution_3531 {
    public int countCoveredBuildings(int n, int[][] buildings) {
        int[] maxRow = new int[n+1];
        int[] minRow = new int[n+1];
        int[] maxCol = new int[n+1];
        int[] minCol = new int[n+1];

        Arrays.fill(minCol, n+1);
        Arrays.fill(minRow, n+1);

        for(int[] p : buildings){
            int x = p[0]; int y = p[1];
            maxRow[y] = Math.max(maxRow[y], x);
            minRow[y] = Math.min(minRow[y], x);
            maxCol[x] = Math.max(maxCol[x], y);
            minCol[x] = Math.min(minCol[x], y);
        }
        int res = 0;
        for(int[]p : buildings){
            int x = p[0]; int y = p[1];
            if(y < maxCol[x] && y > minCol[x] && x < maxRow[y] && x > minRow[y]){
                res++;
            }
        }

        return res;
    }
}
