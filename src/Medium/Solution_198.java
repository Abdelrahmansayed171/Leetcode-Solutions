package Medium;

public class Solution_198 {
        /*public int rob(int[] nums) {
            if(nums.length < 2)
                return nums[0];
            nums[1] = Math.max(nums[0], nums[1]);
            for(int i = 2;i < nums.length;i++){
                nums[i] = Math.max(nums[i] + nums[i-2], nums[i-1]);
            }
            return nums[nums.length-1];
        }*/

    public int rob(int[] nums){
        int max1 = 0, max2 = 0;
        for(int i = 0; i < nums.length;i++){
            max1 = Math.max(max1 + nums[i], max2);
            int tmp = max2;
            max2 = max1;
            max1 = tmp;
        }
        return max2;
    }
}
