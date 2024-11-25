package Top_Interview_150;

import Medium.TreeNode;
import com.sun.source.tree.Tree;

// Easy
// 222. Count Complete Tree Nodes

public class Count_Complete_Tree_Nodes {
    int nodes_num = 0;
    public int countNodes(TreeNode root) {
        if(root == null)
            return 0;
        count(root);
        return nodes_num;
    }

    private void count(TreeNode root) {
        if(root == null)
            return;
        nodes_num++;
        countNodes(root.left);
        countNodes(root.right);
    }
}
