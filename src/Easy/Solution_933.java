package Easy;

import java.util.LinkedList;
import java.util.Queue;

public class Solution_933 {
    Queue<Integer> interval = new LinkedList<>();
    public int ping(int t) {
        int ans = 1;
        while (!interval.isEmpty()){
            if(interval.peek() >= (t-3000)){
                ans+= interval.size();
                break;
            }
            else{
                interval.poll();
            }
        }
        interval.add(t);
        return ans;
    }
}
