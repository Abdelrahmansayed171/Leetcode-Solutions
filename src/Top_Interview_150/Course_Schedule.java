package Top_Interview_150;
import java.util.*;

// 207. Course Schedule
// Medium

public class Course_Schedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = constructAdj(numCourses, prerequisites);

        boolean[] recStack = new boolean[numCourses];
        boolean[] visited = new boolean[numCourses];
        for(int i = 0;i < numCourses;i++){
            if(hasCycle(graph, visited,recStack, i))
                return false;
        }
        return true;
    }

    private boolean hasCycle(List<List<Integer>> graph, boolean[] visited, boolean[] recStack, int i) {
        visited[i] = true;
        recStack[i] = true;
        for(int neighbor : graph.get(i)){
            if(recStack[neighbor])
                return true;
            if(!visited[neighbor]){
                if(hasCycle(graph, visited, recStack,neighbor))
                    return true;
            }
        }
        recStack[i] = false;
        return false;
    }

    private List<List<Integer>> constructAdj(int numCourses, int[][] prerequisites){
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i = 0; i < numCourses;i++)
            adjList.add(new ArrayList<>());
        for(int[] preq : prerequisites){
            adjList.get(preq[0]).add(preq[1]);
        }
        return adjList;
    }
}
