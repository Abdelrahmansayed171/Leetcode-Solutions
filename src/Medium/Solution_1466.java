package Medium;

import java.util.ArrayList;
import java.util.List;
public class Solution_1466 {
    public int helper(List<List<Integer>> adj, boolean[] visited, int curr){
        visited[curr] = true;
        int change = 0;
        for(int i : adj.get(curr)){
            if(!visited[Math.abs(i)]){
                change += (i > 0? 1:0);
                change += helper(adj,visited,Math.abs(i));
            }
        }
        return change;
    }
    public int minReorder(int n, int[][] connections) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++)
            adj.add(new ArrayList<>());
        for(int[] conn : connections){
            adj.get(conn[0]).add(conn[1]);
            adj.get(conn[1]).add(-conn[0]);
        }
        return helper(adj, new boolean[n], 0);
    }
}
