package Medium;

import java.util.Stack;

public class Solution_739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        Stack<int[]> stack = new Stack<>();
        for(int i = 0; i < n;i++){
            while (!stack.isEmpty() && stack.peek()[0] < temperatures[i]){
                int idx = stack.peek()[1];
                res[idx] = i - idx;
                stack.pop();
            }
            stack.push(new int[] {temperatures[i], i});
        }
        return res;
    }
}
