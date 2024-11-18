package Top_Interview_150;

import Medium.TreeNode;

import java.util.HashMap;
import java.util.Map;

// Medium
// 105. Construct Binary Tree from Preorder and Inorder Traversal
public class Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {
    int curIdx = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> inorderMap = new HashMap<>();
        for(int i = 0;i < inorder.length ; i++)
            inorderMap.put(inorder[i],i);
        return buildSubTree(preorder, inorderMap,0, inorder.length-1);
    }
    private TreeNode buildSubTree(int[] preorder, Map<Integer, Integer> inorder, int start, int end){
        if(start > end)
            return null;

        int val = preorder[curIdx++];
        TreeNode root = new TreeNode(val);
        int mid = inorder.get(val);

        root.left = buildSubTree(preorder, inorder, start, mid-1);
        root.right = buildSubTree(preorder, inorder,mid+1, end);
        return root;
    }
}
