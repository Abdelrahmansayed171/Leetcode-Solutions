package Top_Interview_150;

import Medium.TreeNode;

import java.util.HashMap;
import java.util.Map;

// Medium
// 106. Construct Binary Tree from Inorder and Postorder Traversal

public class Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal {
    int idx;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        idx = postorder.length-1;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }
        return buildSubTree(postorder,0, inorder.length-1,map);
    }
    private TreeNode buildSubTree(int[] postorder, int left,int right, Map<Integer, Integer> inorderPositions){
        if(left > right)
            return null;
        int val = postorder[idx--];
        TreeNode root = new TreeNode(val);
        root.right = buildSubTree(postorder, inorderPositions.get(val)+1, right, inorderPositions);
        root.left = buildSubTree(postorder, left,inorderPositions.get(val)-1, inorderPositions);
        return root;
    }
}
