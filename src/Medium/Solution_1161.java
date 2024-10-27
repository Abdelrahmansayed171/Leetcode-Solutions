package Medium;

import java.util.HashMap;
import java.util.Map;

public class Solution_1161 {
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

}
