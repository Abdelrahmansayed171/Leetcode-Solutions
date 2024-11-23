package Top_Interview_150;

import Medium.TreeNode;

// Easy
// 112. Path Sum
public class Path_Sum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null)
            return false;

        if(root.left == null && root.right == null)
            return root.val == targetSum;
        return hasPathSum(root.left, targetSum-root.val) || hasPathSum(root.right, targetSum-root.val);
    }
}
