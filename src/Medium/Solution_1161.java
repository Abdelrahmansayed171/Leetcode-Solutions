package Medium;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Solution_1161 {
    /*
    Map<Integer, Integer> lvlSums = new HashMap<>();
    public int maxLevelSum(TreeNode root) {
        helper(root, 0);
        int max =-99999999, ans = 0;
        for(int i =0; true;i++){
            if(!lvlSums.containsKey(i))
                break;
            int lvlSum = lvlSums.get(i);
            System.out.println(i+" : "+lvlSum);
            if( lvlSum > max){
                max = lvlSum;
                ans = i+1;
            }
        }
        return ans;
    }
    public void helper(TreeNode node, int lvl){
        if(node == null)
            return;
        lvlSums.put(lvl, lvlSums.getOrDefault(lvl,0)+node.val);
        helper(node.left, lvl+1);
        helper(node.right, lvl+1);
    }
    */

    public int maxLevelSum(TreeNode root) {
        if(root==null){
            return 0;
        }

        int maxSum=Integer.MIN_VALUE,maxLevel=0,level=0;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int sum=0;
            int n=queue.size();
            level++;
            for(int i=0;i<n;i++){
                TreeNode currNode=queue.poll();
                sum+=currNode.val;

                if(currNode.left!=null){
                    queue.add(currNode.left);
                }
                if(currNode.right!=null){
                    queue.add(currNode.right);
                }
            }
            if(sum>maxSum){
                maxSum=sum;
                maxLevel=level;
            }
        }
        return maxLevel;
    }

}
