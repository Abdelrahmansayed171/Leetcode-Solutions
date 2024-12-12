package Top_Interview_150;

// 133. Clone Graph
// Medium

import java.util.*;

public class Clone_Graph {
    public GraphNode cloneGraph(GraphNode node) {
        if(node == null)
            return null;
        Map<GraphNode, GraphNode> mappings = new HashMap<>();
        Stack<GraphNode> dfs = new Stack<>();
        dfs.push(node);
        mappings.put(node, new GraphNode(node.val));

        while(!dfs.isEmpty()){
            GraphNode curr = dfs.pop();
            for(GraphNode neighbor : curr.neighbors){
                if(!mappings.containsKey(neighbor)) {
                    mappings.put(neighbor, new GraphNode(neighbor.val));
                    dfs.push(neighbor);
                }
                mappings.get(curr).neighbors.add(mappings.get(neighbor));
            }
        }
        return mappings.get(node);
    }
}
