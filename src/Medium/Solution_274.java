package Medium;

import java.util.Arrays;
import java.util.Collections;

public class Solution_274 {
    public int hIndex(int[] citations) {
        int n = citations.length;
        if(n == 1)
            return Math.min(citations[0],1);
        int ans = 1;
        Arrays.sort(citations);
        for(int i = n-1; i >=0 ; i--){
            ans = Math.max(ans, Math.min(citations[i], n-i));
        }
        return ans;
    }
}
