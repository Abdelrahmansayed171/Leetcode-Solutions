public class Solution_1732 {
    public int largestAltitude(int[] gain) {
        int ans = 0;
        int tmp = 0;
        for( int i : gain){
            tmp +=i;
            ans = Math.max(ans, tmp);
        }
        return ans;
    }
}
