package Top_Interview_150;
import java.util.*;

// 210. Course Schedule II
// Medium

public class Course_Schedule_II {

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i =0; i < numCourses;i++)
            graph.add(new ArrayList<>());
        for(int[] pre: prerequisites){
            graph.get(pre[0]).add(pre[1]);
        }
        boolean[] curPath = new boolean[numCourses];
        boolean[] visited = new boolean[numCourses];
        List<Integer> orderResult = new ArrayList<>();
        for(int i = 0 ;i < numCourses;i++){
            if(!dfs(graph,i,curPath,visited,orderResult))
                return new int[0];
        }
        int[] order = new int[numCourses];
        for(int i = 0 ;i < numCourses;i++){
            order[i] = orderResult.get(i);
        }
        return order;
    }

    private boolean dfs(List<List<Integer>> graph, int node, boolean[] curPath, boolean[] visited, List<Integer> orderResult) {
        if(curPath[node]) return false;
        if(visited[node]) return true;
        visited[node] = true; curPath[node] = true;
        for(int neighbor : graph.get(node)){
            if (!dfs(graph, neighbor, curPath, visited, orderResult)) {
                return false;
            }
        }
        curPath[node] = false;
        orderResult.add(node);
        return true;
    }
}
