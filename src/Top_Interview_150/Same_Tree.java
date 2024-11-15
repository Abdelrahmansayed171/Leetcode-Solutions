package Top_Interview_150;

import Medium.TreeNode;

// Easy 100. Same Tree
class Same_Tree {
    /*public boolean isSameTree(TreeNode p, TreeNode q) {
        if((p == null && q != null) || (p != null && q == null))
            return false;
        if(p == null && q == null)
            return true;
        if(p.val != q.val)
            return false;
        boolean left = isSameTree(p.left, q.left);
        boolean right = isSameTree(p.right, q.right);
        return left && right;
    }*/
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null)
            return true;
        if(p == null || q == null || p.val != q.val)
            return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

}
