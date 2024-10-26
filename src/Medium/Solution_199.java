package Medium;

import java.util.*;

public class Solution_199 {
    /*
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        if(root == null)
            return ans;
        queue.add(root);
        int cnt = 1;
        map.put(0, root.val);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node.left != null) {
                queue.add(node.left);
                cnt++;
                map.put((int)(Math.log(cnt)/Math.log(2)), node.left.val);

            }
            else if(node.right != null) {
                queue.add(node.right);
                cnt++;
                map.put((int)(Math.log(cnt)/Math.log(2)), node.right.val);
            }
        }
        for (int i =0; true; i++){
            if(!map.containsKey(i))
                break;
            ans.add(map.get(i));
        }
        return ans;
    }
    */
    public List<Integer> rightSideView(TreeNode root) {
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

    }
}
