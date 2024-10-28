package Medium;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Solution_841 {
    List<List<Integer>> rooms ;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        this.rooms = rooms;
        boolean[] visited = new boolean[n];
        return helper(rooms.get(0),0,visited, 0) == n;
    }

    private int helper(List<Integer> keys, int curr, boolean[] visited, int cnt) {
        if(visited[curr])
            return cnt;
        cnt++;
        visited[curr] = true;
        for(int i: keys){
            cnt+= helper(rooms.get(i), i, visited, cnt);
        }
        return cnt;
    }
}
