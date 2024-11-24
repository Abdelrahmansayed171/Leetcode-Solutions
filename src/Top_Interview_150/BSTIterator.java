package Top_Interview_150;

import Medium.TreeNode;

import java.util.Stack;

// Medium
// 173. Binary Search Tree Iterator
public class BSTIterator {
    Stack<TreeNode> inOrder;
    public BSTIterator(TreeNode root) {
        inOrder = new Stack<>();
        leftMost(root);
    }

    private void leftMost(TreeNode root) {
        while (root != null){
            inOrder.push(root);
            root = root.left;
        }
    }

    public int next() {
        TreeNode res = inOrder.pop();
        leftMost(res.right);
        return res.val;
    }

    public boolean hasNext() {
        return !inOrder.isEmpty();
    }
}
