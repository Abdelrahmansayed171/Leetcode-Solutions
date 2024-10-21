package Easy;

import com.sun.source.tree.Tree;

import java.util.*;

public class Solution_872 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();
        stack.push(root1);
        while (!stack.isEmpty()){
            TreeNode cur = stack.pop();
            if(cur.right != null){
                stack.push(cur.right);
            }
            if(cur.left != null){
                stack.push(cur.left);
            }
            if(cur.left == null && cur.right == null){
                leaves1.add(cur.val);
            }
        }
        stack = new Stack<>();
        stack.push(root2);
        while (!stack.isEmpty()){
            TreeNode cur = stack.pop();
            if(cur.right != null){
                stack.push(cur.right);
            }
            if(cur.left != null){
                stack.push(cur.left);
            }
            if(cur.left == null && cur.right == null){
                leaves2.add(cur.val);
            }
        }
        if(leaves1.size() != leaves2.size())
            return false;
        for (int i =0; i < leaves1.size();i++){
            System.out.println(leaves1.get(i) + " " + leaves2.get(i));
            if(!leaves1.get(i).equals(leaves2.get(i)))
                return false;
        }
        return true;
    }
}
