package Medium;

// Remove Duplicates from Sorted Array II

public class Solution_80 {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 2)
            return nums.length;
        int w = 2;
        for(int r = 2; r < nums.length; r++){
            if(nums[w-2] != nums[r]){
                nums[w] = nums[r];
                w++;
            }
        }
        return w;
    }
}
