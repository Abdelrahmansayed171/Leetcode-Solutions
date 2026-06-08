package Medium;

public class Solution_45 {
    public int jump(int[] nums) {
        int cnt = 0;
        int maxReach = 0;
        int curEnd = 0;
        for(int i = 0; i < nums.length ;i++){
            maxReach = Math.max(maxReach, i + nums[ i ]);
            if(i == curEnd){
                cnt++;
                curEnd = maxReach;
                if(curEnd >= nums.length-1)
                    return cnt;
            }
        }
        return 0;
    }
}
