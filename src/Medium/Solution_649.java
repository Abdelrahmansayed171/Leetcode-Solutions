package Medium;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution_649 {
    public String predictPartyVictory(String senate) {
        Queue<Character> queue = new LinkedList<>();
        int rcnt = 0, dcnt = 0;

        for(char c : senate.toCharArray()){
            queue.add(c);
            if(c == 'R')
                rcnt++;
            else
                dcnt++;
        }
        int rt = 0, dt = 0;
        while (rcnt > 0 && dcnt > 0 && !queue.isEmpty()){
            char tmp = queue.poll();
            if(tmp == 'D'){
                if(rt > 0){
                    rt--;
                    dcnt--;
                    continue;
                }
                dt++;
            }
            else {
                if(dt > 0){
                    dt--;
                    rcnt--;
                    continue;
                }
                rt++;
            }
            queue.add(tmp);
        }
        if(rcnt > 0){
            return "Radiant";
        }
        else{
            return "Dire";
        }
    }
}
