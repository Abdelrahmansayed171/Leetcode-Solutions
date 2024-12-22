package Top_Interview_150;
import java.util.*;

// 169. Majority Element
// Medium

public class Majority_Element {
    public int majorityElement(int[] nums) {
        int cnt = 0;
        int candidate = 0;
        for(int num : nums){
            if(cnt == 0)
                candidate = num;
            if(candidate == num)
                cnt++;
            else
                cnt--;
        }
        return candidate;
    }
}
