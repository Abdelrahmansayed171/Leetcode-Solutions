package Easy;

import java.sql.Array;

// https://leetcode.com/problems/find-pivot-index/?envType=study-plan-v2&envId=leetcode-75
// Find Pivot Index
public class Solution_724 {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        prefix[0] = 0;
        suffix[n-1] = 0;
        for (int i = n-2; i >= 0; i--){
            suffix[i] = suffix[i+1] + nums[i+1];
        }
        for (int i = 1; i < n;i++){
            prefix[i] = prefix[i-1] + nums[i-1];
        }
        for(int i =0; i < n;i++){
            if(prefix[i] == suffix[i]){
                return i;
            }
        }
        return -1;
    }
}
