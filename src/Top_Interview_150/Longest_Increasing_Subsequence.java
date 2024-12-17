package Top_Interview_150;
import java.util.*;

// 300. Longest Increasing Subsequence
// Medium

public class Longest_Increasing_Subsequence {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        dp[nums.length-1] = 1;
        int res = -1;
        for(int i = nums.length-1; i >= 0; i--){
            dp[i] = 1;
            for(int j = i + 1 ; j < nums.length;j++){
                if(nums[i] < nums[j]){
                    dp[i] = Math.max(dp[i], 1+dp[j]);
                }
            }
            res = Math.max(res,dp[i]);
        }
        return res;
    }
}
