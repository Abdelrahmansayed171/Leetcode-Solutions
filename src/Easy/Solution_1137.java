package Easy;

public class Solution_1137 {
    // Recursion Solution
    /*public int tribonacci(int n) {
        if(n == 0 || n == 1)
            return n;
        if(n == 2)
            return 1;
        return tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);
    }*/

    public int tribonacci(int n) {
        int[] arr = {0 , 1 ,1};
        if( n < 3 )
            return arr[n];
        for(int i = 3;i <= n;i++){
            int sum = arr[0] + arr[1] + arr[2];
            arr[0] = arr[1];
            arr[1] = arr[2];
            arr[2] = sum;
        }
        return arr[2];
    }
}
