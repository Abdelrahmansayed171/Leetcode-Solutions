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
        if(!reachable(adj, query, new HashSet<>()))
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

    private boolean reachable(Map<String, Map<String, Double>> adj, List<String> query, Set<String> visited) {
        if(!adj.containsKey(query.get(0)) || !adj.containsKey(query.get(1)))
            return false;
        if(query.get(0).equals(query.get(1)))
            return true;
        visited.add(query.get(0));
        for(String din : adj.get(query.get(0)).keySet()){
            if(!visited.contains(din))
                if(reachable(adj, List.of(din, query.get(1)), visited))
                    return true;
        }
        return false;
    }
}
