package Top_Interview_150;

// Medium
// 117. Populating Next Right Pointers in Each Node II

import java.util.LinkedList;
import java.util.Queue;

public class Populating_Next_Right_Pointers_in_Each_Node_II {
    public Node connect(Node root) {
        if (root == null) return null;

        Queue<Node> bfs = new LinkedList<>();
        bfs.add(root);

        while (!bfs.isEmpty()) {
            int n = bfs.size();
            Node prev = null;

            for (int i = 0; i < n; i++) {
                Node curr = bfs.poll();
                if (prev != null) {
                    prev.next = curr;
                }
                prev = curr;

                if (curr.left != null) {
                    bfs.add(curr.left);
                }
                if (curr.right != null) {
                    bfs.add(curr.right);
                }
            }

            if (prev != null) {
                prev.next = null;
            }
        }
        return root;
    }


}
