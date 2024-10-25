package Medium;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Stack;
import java.util.List;

public class Solution_236 {
/*    List<TreeNode> lp = new ArrayList<>();
    List<TreeNode> lq = new ArrayList<>();
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null)
            return null;
        helper(root, p, lp);
        helper(root, q, lq);
        TreeNode pre = null;
        for(int i =0; i < lp.size(); i++){
            if(i >= lq.size())
                return pre;
            if(lp.get(i).val == lq.get(i).val)
                pre = lp.get(i);
            else
                return pre;
        }
        return pre;
    }
    public boolean helper (TreeNode root, TreeNode target, List<TreeNode> list) {
        if(root == null)
            return false;
        list.add(root);
        if(root.val == target.val)
            return true;

        if(helper(root.left, target, list) || helper(root.right, target, list))
            return true;

        list.remove(list.size()-1);
        return false;
    }
    */
    
}
