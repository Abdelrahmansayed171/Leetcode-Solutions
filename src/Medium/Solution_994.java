package Medium;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution_994 {
    int mins = -1;
    int fresh_cnt = 0;
    int rows, columns;
    public int orangesRotting(int[][] grid) {
        rows = grid.length; columns = grid[0].length;
        Queue<List<Integer>> queue = new LinkedList<>();
        for(int x =0;x < rows;x++){
            for(int y = 0; y < columns;y++){
                if(grid[x][y] == 1)
                    fresh_cnt++;
                else if(grid[x][y] == 2)
                    queue.offer(List.of(x,y));
            }
        }
        if(fresh_cnt == 0)
            return 0;
        bfs(grid, queue);
        return mins;
    }
    private void bfs(int[][] grid, Queue<List<Integer>> queue){
        int[][] neighbors = new int[][] {{0, -1}, {0, 1}, {1, 0}, {-1, 0}};
        while(!queue.isEmpty()){
            int n = queue.size();
            for(int it = 0; it < n ;it++){
                List<Integer> loc = queue.poll();
                int x , y;
                for(int i =0; i < 4;i++){
                    x = loc.get(0) + neighbors[i][0];
                    y = loc.get(1) + neighbors[i][1];
                    if(x < 0 || y < 0 || x >= rows || y >= columns) continue;
                    if(grid[x][y] == 2 || grid[x][y] == 0) continue;
                    grid[x][y] = 2;
                    fresh_cnt--;
                    queue.offer(List.of(x,y));
                }
            }
            mins++;
        }
        if(fresh_cnt != 0)
            mins=-1;
    }
}
