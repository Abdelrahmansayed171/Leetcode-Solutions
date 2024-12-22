package Top_Interview_150;
import java.util.*;

// 26. Remove Duplicates From Sorted Array
// Easy

public class Remove_Duplicates_From_Sorted_Array {
    // O(n) - 2 Pointers
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for(int i = 1; i < nums.length;i++){
            if(nums[i] != nums[i-1]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    // O(nlog(n))
    /*public int removeDuplicates(int[] nums) {
        int cnt = 0;
        for(int i = 0; i < nums.length - 1;i++){
            if(nums[i] == nums[i+1]) {
                nums[i] = 103;
                cnt++;
            }
        }
        Arrays.sort(nums);
        return nums.length - cnt;
    }*/
}
