package Medium;

public class Solution_875 {
    public int minEatingSpeed(int[] piles, int h) {
        int max = -1;
        for(int i : piles) max = Math.max(i, max);
        int left = 1, right = max;
        int k = Integer.MAX_VALUE;
        while( left <= right){
            int mid = left+(right-left)/2;
            long hours = 0;
            for(int i =0; i < piles.length;i++){
                if(piles[i] % mid != 0)hours++;
                hours += piles[i]/mid;
            }
            if(hours <= h){
                right = mid-1;
                k = Math.min(k, mid);
            }
            else{
                left = mid+1;
            }
        }
        return k;
    }
}
