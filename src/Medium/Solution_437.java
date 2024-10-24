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
}
