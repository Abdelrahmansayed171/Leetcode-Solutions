package Medium;

public class Solution_55 {
    public boolean canJump(int[] nums) {
        int maxJump = 0;
        for(int i = 0; i < nums.length;i++){
            if(i > maxJump)
                return false;
            maxJump = Math.max(maxJump, nums[i] + i);
        }
        return true;
    }
}
