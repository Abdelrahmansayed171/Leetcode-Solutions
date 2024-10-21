package Easy;

import com.sun.source.tree.Tree;

import java.util.*;

public class Solution_872 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();
        getLeaves(root1,leaves1);
        getLeaves(root2,leaves2);
        if(leaves1.size() != leaves2.size())
            return false;
        for (int i =0; i < leaves1.size();i++){
            System.out.println(leaves1.get(i) + " " + leaves2.get(i));
            if(!leaves1.get(i).equals(leaves2.get(i)))
                return false;
        }
        return true;
    }
    public void getLeaves(TreeNode root, List<Integer> leaves){
        if(root == null)
            return;
        if(root.left == null && root.right == null){
            leaves.add(root.val);
        }
        getLeaves(root.left,leaves);
        getLeaves(root.right, leaves);
    }
}
