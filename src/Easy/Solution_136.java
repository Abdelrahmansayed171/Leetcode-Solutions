package Easy;

import java.util.HashMap;
import java.util.Map;

public class Solution_136 {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> occ = new HashMap<>();
        for (int num : nums)
            occ.put(num, occ.getOrDefault(num, 0) + 1);
        for(int key : occ.keySet()){
            if(occ.get(key).equals(1))
                return key;
        }
        return 0;
    }
}
