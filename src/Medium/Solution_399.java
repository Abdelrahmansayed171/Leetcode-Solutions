package Medium;

import java.util.*;

public class Solution_399 {
    double ans = -1.00000;
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> adj = new HashMap<>();
        double[] result = new double[queries.size()];
        for(int i =0; i < equations.size();i++){
            String nom = equations.get(i).get(0);
            String dino = equations.get(i).get(1);
            adj.putIfAbsent(nom, new HashMap<>());
            adj.putIfAbsent(dino, new HashMap<>());
            adj.get(nom).put(dino, values[i]);
            adj.get(dino).put(nom, 1 / values[i]);
        }
        for(int i = 0; i < queries.size();i++){
            solve(adj, queries.get(i), 1.00000, new HashSet<>());
            result[i] = ans;
            ans = -1.00000;
        }
        return result;
    }
    private void solve(Map<String, Map<String, Double>> adj, List<String> query, double res, Set<String> visited) {
        if(!adj.containsKey(query.get(0)) || !adj.containsKey(query.get(1)))
            return;
        String nomi = query.get(0), dino = query.get(1);
        if(nomi.equals(dino)) {
            ans = res;
            return;
        }
        visited.add(nomi);
        for(String neighbor : adj.get(nomi).keySet()){
            if(!visited.contains(neighbor)){
                double weight = adj.get(nomi).get(neighbor);
                System.out.println(nomi + " : " + dino );
                List<String> tmp = new ArrayList<>();
                tmp.add(neighbor);tmp.add(dino);
                solve(adj, tmp, weight * res, visited);
            }
        }
    }

    /*public void dfs(String node, String dest, HashMap<String, HashMap<String, Double>> gr, HashSet<String> vis, double[] ans, double temp) {
        if (vis.contains(node))
            return;

        vis.add(node);
        if (node.equals(dest)) {
            ans[0] = temp;
            return;
        }

        for (Map.Entry<String, Double> entry : gr.get(node).entrySet()) {
            String ne = entry.getKey();
            double val = entry.getValue();
            dfs(ne, dest, gr, vis, ans, temp * val);
        }
    }

    public HashMap<String, HashMap<String, Double>> buildGraph(List<List<String>> equations, double[] values) {
        HashMap<String, HashMap<String, Double>> gr = new HashMap<>();

        for (int i = 0; i < equations.size(); i++) {
            String dividend = equations.get(i).get(0);
            String divisor = equations.get(i).get(1);
            double value = values[i];

            gr.putIfAbsent(dividend, new HashMap<>());
            gr.putIfAbsent(divisor, new HashMap<>());

            gr.get(dividend).put(divisor, value);
            gr.get(divisor).put(dividend, 1.0 / value);
        }

        return gr;
    }

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        HashMap<String, HashMap<String, Double>> gr = buildGraph(equations, values);
        double[] finalAns = new double[queries.size()];

        for (int i = 0; i < queries.size(); i++) {
            String dividend = queries.get(i).get(0);
            String divisor = queries.get(i).get(1);

            if (!gr.containsKey(dividend) || !gr.containsKey(divisor)) {
                finalAns[i] = -1.0;
            } else {
                HashSet<String> vis = new HashSet<>();
                double[] ans = {-1.0};
                double temp = 1.0;
                dfs(dividend, divisor, gr, vis, ans, temp);
                finalAns[i] = ans[0];
            }
        }

        return finalAns;
    }*/
}
