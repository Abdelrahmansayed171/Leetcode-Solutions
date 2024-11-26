package Top_Interview_150;

import Medium.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 637. Average of Levels in Binary Tree
// Easy

public class Average_Of_Levels_In_Binary_Tree {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null)
            return res;
        queue.add(root);
        while(!queue.isEmpty()){
            int n = queue.size();
            Double sum = 0.0;
            for(int i = 0; i < n;i++){
                TreeNode curr = queue.poll();
                sum += curr.val;
                if(curr.left != null)
                    queue.offer(curr.left);
                if(curr.right != null)
                    queue.offer(curr.right);
            }
            res.add(sum / n);
        }
        return res;
    }
}
