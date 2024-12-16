package Top_Interview_150;
import java.util.*;


// 198. House Robber
// Medium

public class House_Robber {

    public int rob(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        nums[1] = Math.max(nums[0], nums[1]);
        for(int i = 2;i < nums.length;i++){
            nums[i] = Math.max(nums[i-1], nums[i]+nums[i-2]);
        }
        return nums[nums.length-1];
    }
}
