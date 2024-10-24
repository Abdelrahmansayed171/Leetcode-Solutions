package Medium;

public class Solution_437 {
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null)
            return 0;
        return helper(root, targetSum, 0)
                + pathSum(root.left, targetSum)
                + pathSum(root.right, targetSum);
    }
    public int helper(TreeNode root, int targetSum, long sum){
        if(root == null)
            return 0;
        sum+= root.val;
        return (sum == targetSum ? 1 : 0)
                + helper(root.left, targetSum, sum)
                + helper(root.right, targetSum, sum);
    }

    /*
    // Map for keeping track of (PrefixSum, timesPrefixSumSeen) during traversal
    Map<Long, Integer> hmap;
    int count;

    public int pathSum(TreeNode root, int targetSum) {
        hmap = new HashMap<>();
        count = 0;

        dfs(root, 0, targetSum);

        return count;
    }

    private void dfs(TreeNode root, long prefixSum, int targetSum) {
        // base case
        if (root == null) return;


        prefixSum += root.val;

        // If map contains a sum equal to (prefixSum - targetSum), we need to increment count that many times
        if (hmap.containsKey(prefixSum-targetSum)) {
            count ++;
        }

        // There can be cases when the prefixSum is directly equal to targetSum, we need to increment count
        if (targetSum == prefixSum) {
            count++;
        }

        // Update the prefixSum till current node and it's count
        hmap.put(prefixSum, hmap.getOrDefault(prefixSum, 0) + 1);

        // Recurse
        dfs(root.left, prefixSum, targetSum);
        dfs(root.right, prefixSum, targetSum);

        // Backtrack
        hmap.put(prefixSum, hmap.get(prefixSum) - 1);

    }
    */
}
