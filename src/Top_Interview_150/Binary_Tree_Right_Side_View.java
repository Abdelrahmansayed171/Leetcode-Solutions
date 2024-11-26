package Top_Interview_150;

import Medium.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Medium
// 199. Binary Tree Right Side View
public class Binary_Tree_Right_Side_View {

    //BFS Solution
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null)
            return res;
        queue.offer(root);
        int n ;
        while(!queue.isEmpty()){
            n = queue.size();
            for(int i =0;i < n;i++){
                TreeNode cur = queue.poll();
                if(i == n -1){
                    res.add(cur.val);
                }
                if(cur.left != null)
                    queue.offer(cur.left);
                if(cur.right != null)
                    queue.offer(cur.right);
            }
        }
        return res;
    }


    // DFS SOLUTION
/*    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        helper(root, result, 0);
        return result;
    }

    public void helper(TreeNode curr, List<Integer> result, int currDepth){
        if(curr == null){
            return;
        }
        if(currDepth == result.size()){
            result.add(curr.val);
        }

        helper(curr.right, result, currDepth + 1);
        helper(curr.left, result, currDepth + 1);

    }*/
}
