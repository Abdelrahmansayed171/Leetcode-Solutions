package Top_Interview_150;

// 133. Clone Graph
// Medium

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Clone_Graph {
    public GraphNode cloneGraph(GraphNode node) {
        if(node == null)
            return null;
        Set<Integer> visited = new HashSet<>();
        GraphNode root = new GraphNode();
        Stack<GraphNode> dfs = new Stack<>();
        Stack<GraphNode> origins = new Stack<>();
        dfs.push(root);
        origins.push(node);
        while(!dfs.isEmpty() && !origins.isEmpty()){
            GraphNode origin = origins.pop();
            visited.add(origin.val);
            GraphNode curr = dfs.pop();
            curr.val = origin.val;
            for(GraphNode neighbor : origin.neighbors){
                if(!visited.contains(neighbor.val)) {
                    GraphNode newNode = new GraphNode();
                    newNode.neighbors.add(curr);
                    curr.neighbors.add(newNode);
                    dfs.push(newNode);
                    origins.push(neighbor);
                }
            }
        }
        return root;
    }
}
