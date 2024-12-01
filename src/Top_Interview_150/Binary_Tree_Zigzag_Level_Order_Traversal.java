package Top_Interview_150;

import Medium.TreeNode;

import java.util.*;

// 103. Binary Tree Zigzag Level Order Traversal
// Medium

public class Binary_Tree_Zigzag_Level_Order_Traversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
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
        for(int i =1 ; i < res.size();i+=2){
            Collections.reverse(res.get(i));
        }
        return res;
    }
}
