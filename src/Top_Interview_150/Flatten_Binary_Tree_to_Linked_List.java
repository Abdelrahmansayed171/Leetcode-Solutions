package Top_Interview_150;


import Medium.TreeNode;

// Medium
// 114. Flatten Binary Tree to Linked List
public class Flatten_Binary_Tree_to_Linked_List {
    public void flatten(TreeNode root) {
        if(root == null)
            return;
        if(root.left != null) {
            rightMost(root.left).right = root.right;
            root.right = root.left;
        }
        root.left = null;
        flatten(root.right);
    }

    private TreeNode rightMost(TreeNode root){
        if(root.right == null)
            return root;
        return rightMost(root.right);
    }
}
