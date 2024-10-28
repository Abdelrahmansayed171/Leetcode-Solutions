package Medium;

import Medium.TreeNode;
import com.sun.source.tree.Tree;

public class Solution_450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null)
            return null;
        if(root.val > key)
            root.left = deleteNode(root.left,key);
        else if(root.val < key)
            root.right = deleteNode(root.right, key);
        else {
            if(root.left == null && root.right == null)
                return null;
            if(root.left == null)
                return root.right;
            else if(root.right == null)
                return root.left;

            TreeNode rep = getReplacement(root.right);
            root.val = rep.val;
            root.right = deleteNode(root.right, rep.val);
        }
        return root;
    }

    public TreeNode getReplacement(TreeNode root){
        while (root.left != null){
            root = root.left;
        }
        return root;
    }
}
