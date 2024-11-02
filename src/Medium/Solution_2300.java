package Medium;

import java.util.Arrays;

public class Solution_2300 {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions); // m * log(m)
        int n = spells.length;
        int[] res = new int [n];
        for(int i = 0; i < n;i++){
            int left = 0, right = potions.length-1;
            while(left <= right){
                int mid = left + (right-left)/2;
                if ((long) spells[i] * potions[mid] < success){
                    left = mid+1;
                }
                else{
                    res[i] = Math.max(res[i], potions.length - mid);
                    right = mid-1;
                }
            }
        }
        return res;
    }
}
