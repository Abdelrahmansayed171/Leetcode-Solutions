package Top_Interview_150;
import java.lang.reflect.Array;
import java.util.*;

// 120. Triangle
// Medium

public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] dp = new int[triangle.size()+1];
        Arrays.fill(dp,0);
        for(int i = triangle.size()-1; i >= 0 ; i-- ){
            for(int j = 0; j < i+1;j++){
                dp[j] = triangle.get(i).get(j) + Math.min(dp[j], dp[j+1]);
            }
        }
        return dp[0];
    }
}
