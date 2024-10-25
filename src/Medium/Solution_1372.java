package Medium;

import com.sun.source.tree.Tree;

public class Solution_1372 {
    int result = -1;
    public int longestZigZag(TreeNode root) {
        helper(root, "root", 0);
        return result;
    }
    public void helper(TreeNode root, String direction, int cnt){
        if(root == null)
            return;
        result = Math.max(result, cnt);

        if(direction == "left"){
            helper(root.right, "right", cnt+1);
            helper(root.left, "left", 1);
        }
        if(direction == "right"){
            helper(root.left, "left", cnt+1);
            helper(root.right, "right", 1);
        }
        if(direction == "root"){
            if(root.right != null && root.right.left != null){
                helper(root.right, "right", 1);
            }
            if(root.right != null && root.right.left == null){
                helper(root.right, "root", 0);
            }
            if(root.left != null && root.left.right != null){
                helper(root.left, "left", 1);
            }
            if(root.left != null && root.left.right == null){
                helper(root.left, "root", 0);
            }
        }
    }
}
