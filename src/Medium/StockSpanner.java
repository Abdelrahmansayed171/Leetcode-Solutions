package Medium;

import java.util.Stack;

public class StockSpanner {
    Stack<int[]> stack;
    public StockSpanner() {
        stack = new Stack<>();
    }

    public int next(int price) {
        int res = 1;
        while (!stack.isEmpty() && stack.peek()[0] <= price){
            res += stack.peek()[1];
            stack.pop();
        }
        stack.push(new int[] {price,res});
        return res;
    }
}
