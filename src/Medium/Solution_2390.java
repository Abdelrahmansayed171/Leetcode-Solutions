package Medium;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution_2390 {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '*'){
                stack.pop();
                continue;
            }
            stack.push(c);
        }
        String ans="";
        for(char e:stack){
            ans+=e;
        }
        return ans;
    }
}
