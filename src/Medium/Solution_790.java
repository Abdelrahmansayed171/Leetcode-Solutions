package Medium;

public class Solution_790 {
    public int numTilings(int n) {
        long[] arr = new long[n+3];
        int mod = (int) (1e9 + 7);
        arr[1] = 1; arr[2] = 2; arr[3] = 5;
        for(int i = 4; i<=n;i++){
            arr[i] = (arr[i-1]*2 + arr[i-3]) % mod;
        }
        return (int) arr[n];
    }
}
