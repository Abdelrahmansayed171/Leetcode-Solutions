package Top_Interview_150;

// Medium
// 98. Validate Binary Search Tree

import Medium.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Validate_Binary_Search_Tree {
    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        for(int i = 1;i < list.size();i++){
            if(list.get(i) <= list.get(i-1))
                return false;
        }
        return true;
    }
    public void inorder(TreeNode root, List<Integer> inorderlist){
        if(root == null)
            return;

        inorder(root.left, inorderlist);
        inorderlist.add(root.val);
        inorder(root.right, inorderlist);
    }
}
