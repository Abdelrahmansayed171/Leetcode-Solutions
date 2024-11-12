package Medium;

import java.util.Arrays;

public class Solution_435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        int ans = 0;
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        int prevEnd = intervals[0][1];
        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] >= prevEnd){
                prevEnd = intervals[i][1];
            }
            else{
                ans++;
                prevEnd = Math.min(prevEnd,intervals[i][1]);
            }
        }
        return ans;
    }
}

