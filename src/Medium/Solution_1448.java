package Medium;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.Set;

public class Solution_1448 {
    public int goodNodes(TreeNode root) {
        return helper(root, -100000);
    }
    public int helper(TreeNode root, int max){
        if(root == null){
            return 0;
        }
        int res = root.val >= max? 1: 0;
        res+= helper(root.left, Math.max(root.val, max));
        res+= helper(root.right, Math.max(root.val, max));
        return res;
    }
}
