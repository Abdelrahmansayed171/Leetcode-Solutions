package Top_Interview_150;

import Medium.TreeNode;

// Medium
// 129. Sum Root to Leaf Numbers
public class Sum_Root_to_Leaf_Numbers {
    public int sumNumbers(TreeNode root) {
        return solve(root,0);
    }

    private int solve(TreeNode root, int sum) {
        if(root == null)
            return 0;

        sum+=root.val;
        if(root.left == null && root.right == null)
            return sum;
        return solve(root.left, sum*10) + solve(root.right, sum*10);
    }
}
