package Top_Interview_150;

import Medium.TreeNode;

import java.util.ArrayList;
import java.util.List;

// Medium
// 230. Kth Smallest Element in a BST

public class Kth_Smallest_Element_in_a_BST {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> inorderList = new ArrayList<>();
        inorderHelper(root, inorderList);
        return inorderList.get(k-1);
    }
    private void inorderHelper(TreeNode root, List<Integer> inorderList){
        if(root == null)
            return;

        inorderHelper(root.left, inorderList);
        inorderList.add(root.val);
        inorderHelper(root.right, inorderList);
    }
}
