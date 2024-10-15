package Easy;

// https://leetcode.com/problems/find-the-highest-altitude/description/?envType=study-plan-v2&envId=leetcode-75
// Find the Highest Altitude
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
