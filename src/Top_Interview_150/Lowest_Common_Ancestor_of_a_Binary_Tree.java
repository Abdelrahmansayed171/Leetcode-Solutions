package Top_Interview_150;

import Medium.TreeNode;

// Medium
// 236. Lowest Common Ancestor of a Binary Tree
// common in leetcode75, leetcode150

public class Lowest_Common_Ancestor_of_a_Binary_Tree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q)
            return root;

        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);

        if(left == null)
            return right;
        if(right==null)
            return left;
        return root;
    }
}
