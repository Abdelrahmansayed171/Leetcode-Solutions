package Top_Interview_150;
import java.util.*;

// 399. Evaluate Division
// Medium

public class Evaluate_Division {
    private Map<String, HashMap<String, Double>> graphBuild(List<List<String>> equations, double[] values) {
        Map<String, HashMap<String, Double>> graph = new HashMap<>();
        for(int i = 0; i < values.length;i++){
            String nom = equations.get(i).get(0), din = equations.get(i).get(1);
            graph.putIfAbsent(nom, new HashMap<>());
            graph.putIfAbsent(din, new HashMap<>());

            graph.get(nom).put(din, values[i]);
            graph.get(din).put(nom, 1.0/values[i]);
        }
        return graph;
    }


    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, HashMap<String, Double>> graph = graphBuild(equations, values);

        double[] results = new double[queries.size()];

        for(int i =0; i < queries.size();i++){
            Set<String> visited = new HashSet<>();
            String qnom = queries.get(i).get(0), qdin = queries.get(i).get(1);
            double[] ans = {-1.00000};
            if(graph.containsKey(qnom) && graph.containsKey(qdin))
                solve(graph,qnom,qdin,visited, ans, 1);
            results[i] = ans[0];
        }
        return results;
    }

    private void solve(Map<String, HashMap<String, Double>> graph, String qnom, String qdin, Set<String> visited, double[] ans, double tmp) {
        visited.add(qnom);
        if(qnom.equals(qdin))
            ans[0] = tmp;
        for(String key : graph.get(qnom).keySet()){
            if(!visited.contains(key)){
                solve(graph, key, qdin, visited, ans,tmp*graph.get(qnom).get(key));
            }
        }
    }


}
