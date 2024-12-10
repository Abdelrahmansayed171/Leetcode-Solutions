package Top_Interview_150;

// 70. Climbing Stairs
// Easy

import java.util.ArrayList;
import java.util.List;

public class Climbing_Stairs {
    public int climbStairs(int n) {
        List<Integer> dp=  new ArrayList<>();
        for(int i = 0; i <= n;i++){
            if(i <= 3) {
                dp.add(i);
                continue;
            }
            dp.add(dp.get(dp.size()-1) + dp.get(dp.size()-2));
        }

        return dp.get(dp.size()-1);
    }
}
