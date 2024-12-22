package Top_Interview_150;
import java.util.*;

// 26. Remove Duplicates From Sorted Array
// Easy

public class Remove_Duplicates_From_Sorted_Array {
    public int removeDuplicates(int[] nums) {
        int cnt = 0;
        for(int i = 0; i < nums.length - 1;i++){
            if(nums[i] == nums[i+1]) {
                nums[i] = 103;
                cnt++;
            }
        }
        Arrays.sort(nums);
        return nums.length - cnt;
    }
}
