package Top_Interview_150;
import java.util.*;

// 27. Remove Element
// Easy

public class Remove_Element {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i =0; i < nums.length;i++){
            if(nums[i] == val){
                k++;
                nums[i] = 101;
            }
        }
        Arrays.sort(nums);
        return nums.length-k;
    }
}
