package Easy;

public class Solution_338 {
    public int[] countBits(int n) {
        /*
        * Concolusion 1:
        *   10 -> 1010 when 10 shifted by one bit to the right it will be 5 -> 101
        *   So, we can achieve half of the number by shifting 1 bit to right
        *
        * Conclusion2:
        *   6 -> 110 has the same number of 1s as in its half 3 -> 11
        *   it only shifted by one bit to left
        *
        * Conclusion3:
        *   when we multiply by 2 we shift left putting (0 if even, 1 if odd)
        *   when we need to divide by 2 we shift right
        *   So, 10 has the same number of 1s as in 5, but it's just shifted to left
        * */

        int[] arr = new int[n+1];
        for(int i = 1; i<=n;i++){
            arr[i] = arr[i >> 1] + (i & 1);
        }
        return arr;
    }
}
