package Top_Interview_150;

import Medium.TreeNode;

public class Symmetric_Tree {
    public boolean isSymmetric(TreeNode root) {
        return solve(root.left,root.right);
    }
    public boolean solve(TreeNode r1, TreeNode r2){
        if(r1 == null && r2 == null)
            return true;
        if(r1 == null || r2 == null || r1.val != r2.val)
            return false;
        return solve(r1.right, r2.left) && solve(r1.left,r2.right);
    }
}
