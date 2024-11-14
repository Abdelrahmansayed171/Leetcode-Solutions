package Top_Interview_150;

import Medium.TreeNode;

class Solution {
    public int maxDepth(TreeNode root) {
        return helper(root, 0);
    }

    private int helper(TreeNode root, int depth) {
        if(root == null)
            return depth;
        return Math.max(helper(root.left, depth+1), helper(root.right, depth+1));
    }

    /*
    * Submission 2:
    *   public int maxDepth(TreeNode root) {
            if(root == null)
                return 0;
            return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        }
    * */
}
