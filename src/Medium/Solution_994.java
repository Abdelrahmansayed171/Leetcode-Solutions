package Medium;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution_994 {
    int mins = -1;
    int fresh_cnt = 0;
    public int orangesRotting(int[][] grid) {
        Queue<List<Integer>> queue = new LinkedList<>();
        for(int x =0;x < grid.length;x++){
            for(int y = 0; y < grid[0].length;y++){
                if(grid[x][y] == 1)
                    fresh_cnt++;
                else if(grid[x][y] == 2)
                    queue.offer(List.of(x,y));
            }
        }

    }
    private void bfs(int[][] grid, Queue<List<Integer>> queue){

    }
}
