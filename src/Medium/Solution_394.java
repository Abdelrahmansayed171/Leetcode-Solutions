package Medium;

import java.util.Stack;

/*  https://leetcode.com/problems/decode-string/description/?envType=study-plan-v2&envId=leetcode-75
    Decode String
*/
public class Solution_394 {
    public String decodeString(String s) {
        StringBuilder str = new StringBuilder();
        Stack<Integer> counter = new Stack<>();
        Stack<StringBuilder> outerStr = new Stack<>();
        int n = 0;
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                n = n * 10 + (c - '0');
            }
            else if (c == '[') {
                counter.push(n);
                outerStr.push(str);
                str = new StringBuilder();
                n = 0;
            }
            else if(c == ']'){
                 StringBuilder tmp = str;
                 str = outerStr.pop();
                 int cnt = counter.pop();
                 while (cnt-- > 0){
                     str.append(tmp);
                 }
            }
            else{
                str.append(c);
            }
        }
        return str.toString();
    }
}
