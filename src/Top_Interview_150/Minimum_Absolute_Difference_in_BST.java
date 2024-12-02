package Top_Interview_150;

import Medium.TreeNode;
import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

// 530. Minimum Absolute Difference in BST
// Easy

public class Minimum_Absolute_Difference_in_BST {
    public int getMinimumDifference(TreeNode root) {
        List<Integer> inorderList = new ArrayList<>();
        int res = Integer.MAX_VALUE;
        inorderHelper(root, inorderList);
        for(int i = 1; i < inorderList.size();i++){
            res = Math.min(res, inorderList.get(i) - inorderList.get(i-1));
        }
        return res;
    }

    private void inorderHelper(TreeNode root, List<Integer> inorderList){
        if(root == null)
            return;

        inorderHelper(root.left, inorderList);
        inorderList.add(root.val);
        inorderHelper(root.right, inorderList);
    }
}
