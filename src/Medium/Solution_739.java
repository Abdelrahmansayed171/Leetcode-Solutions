package Medium;

import java.util.Stack;

public class Solution_739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{temperatures[0], 0});
        for(int i = 1; i < n;i++){
            if(stack.peek()[0] < temperatures[i]){
                while (!stack.isEmpty()){
                    int idx = stack.peek()[1];
                    int val = stack.peek()[0];
                    if(val >= temperatures[i])
                        break;
                    res[idx] = i - idx;
                    stack.pop();
                }
            }
            stack.push(new int[] {temperatures[i], i});
        }
        return res;
    }
}
