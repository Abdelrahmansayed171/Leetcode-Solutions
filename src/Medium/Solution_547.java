package Medium;

public class Solution_547 {
    int[][] mat;
    public int findCircleNum(int[][] isConnected) {
        mat = isConnected;
        boolean[] visited = new boolean[isConnected.length];
        int ans = 0;
        for(int i =0;i < isConnected.length;i++){
            ans+= helper(isConnected[i], i, visited);
        }
        return ans;
    }

    private int helper(int[] isConnected, int curr, boolean[] visited) {
        // if node already visited return 0;
        if(visited[curr])
            return 0;
        visited[curr] = true; // mark node as visited
        for (int i = 0;i < isConnected.length;i++){
            if(i == curr)
                continue;
            if(isConnected[i] == 1)
                helper(mat[i], i, visited);
        }
        return 1;
    }
}
