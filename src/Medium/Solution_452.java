package Medium;

import java.util.Arrays;

public class Solution_452 {
    public int findMinArrowShots(int[][] points) {
        int arrows = 1;
        Arrays.sort(points, (a,b) -> Integer.compare(a[0], b[0]));
        int prevEnd = points[0][1];
        for(int i = 1; i< points.length;i++){
            if(points[i][0] <= prevEnd)
                prevEnd = Math.min(prevEnd, points[i][1]);
            else{
                arrows++;
                prevEnd = points[i][1];
            }
        }
        return arrows;
    }
}
