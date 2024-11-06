package Easy;

public class Solution_1137 {
    // Recursion Solution
    public int tribonacci(int n) {
        if(n == 0 || n == 1)
            return n;
        if(n == 2)
            return 1;
        return tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);
    }
}
