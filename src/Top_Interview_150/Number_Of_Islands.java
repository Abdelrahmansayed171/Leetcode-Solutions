package Top_Interview_150;

// 200. Number of Islands
// Medium

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Number_Of_Islands {
    public int numIslands(char[][] grid) {
        int islands = 0;
        Set<String> visited = new HashSet<>();
        for(int i =0; i < grid.length;i++){
            for(int j = 0; j < grid[0].length;j++){
                if(grid[i][j] == '1' && !visited.contains(i+ " " +j)) {
                    islands++;
                    bfs(grid, i, j, visited);
                }
            }
        }
        return islands;
    }
    public void bfs(char[][] grid,int i, int j, Set<String> visited){
        if(visited.contains(i+ " " + j))
            return;
        int[][] neighbors = new int[][] {{-1,0},{0,-1}, {1,0}, {0,1}};
        visited.add(i + " " + j);
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i,j});
        while(!queue.isEmpty()){
            int[] point = queue.poll();
            for(int[] neighbor : neighbors){
                int r = point[0] + neighbor[0], c = point[1] + neighbor[1];
                if(r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || visited.contains(r + " " + c) || grid[r][c] != '1')
                    continue;
                queue.add(new int[] {r,c});
                visited.add(r + " " + c);
            }
        }
    }
}
