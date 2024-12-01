package Top_Interview_150;

import Medium.TreeNode;

import java.util.*;

// 102. Binary Tree Level Order Traversal
// Medium

public class Binary_Tree_Level_Order_Traversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null)
            return new ArrayList<>();

        Queue<TreeNode> bfs = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        bfs.offer(root);

        while(!bfs.isEmpty()){
            int n = bfs.size();
            List<Integer> tmp = new ArrayList<>();
            for(int i = 0;i < n;i++){
                TreeNode curr = bfs.poll();
                tmp.add(curr.val);
                if(curr.left != null)
                    bfs.offer(curr.left);
                if(curr.right != null)
                    bfs.offer(curr.right);
            }
            res.add(tmp);
        }
        return res;
    }
}
