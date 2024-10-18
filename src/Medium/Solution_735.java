package Medium;

import com.sun.source.tree.BreakTree;

import java.util.Stack;

public class Solution_735 {
/*    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        stack.push(asteroids[0]);
        for(int i = 1; i < asteroids.length;i++){
            if(stack.isEmpty()){
                stack.push(asteroids[i]);
                continue;
            }
            int tmp = stack.peek();
            if((tmp < 0 && asteroids[i] < 0) || (tmp > 0 && asteroids[i] > 0) || (tmp < 0 && asteroids[i] > 0)){
                stack.push(asteroids[i]);
            }
            else {
                tmp = Math.abs(tmp);
                int idx = Math.abs(asteroids[i]);
                if(tmp == idx){
                    stack.pop();
                }
                else if (tmp < idx){
                    stack.pop();
                    if(!stack.isEmpty()){
                        tmp = stack.peek();
                        if((tmp < 0 && asteroids[i] < 0) || (tmp > 0 && asteroids[i] > 0 )){
                            stack.push(asteroids[i]);
                        }
                        else {
                            i--;
                        }
                    }
                    else {
                        stack.push(asteroids[i]);
                    }
                }
            }
        }
        int[] result = new int[stack.size()];
        int index = 0;
        for (int asteroid : stack) {
            result[index++] = asteroid;
        }
        return result;
    }*/
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int a : asteroids){
            if(a > 0){
                stack.push(a);
            }
            else{
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -a){
                    stack.pop();
                }

                if(stack.isEmpty() || stack.peek() < 0){
                    stack.push(a);
                }

                if(stack.peek() == -a)
                    stack.pop();
            }
        }
        int[] result = new int[stack.size()];
        int index = 0;
        for (int asteroid : stack) {
            result[index++] = asteroid;
        }
        return result;
    }
}
