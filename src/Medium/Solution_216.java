package Medium;

import java.util.ArrayList;
import java.util.List;

public class Solution_216 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        combine(new ArrayList<>(), res, 1, 0, n, k);
        return res;
    }
    private void combine(List<Integer> nums, List<List<Integer>> res, int idx, int sum, int n, int k){
        if(sum > n || idx > 10 || k < 0)
            return;

        if(sum == n && k == 0){
            res.add(new ArrayList<>(nums)); // Add a copy of nums to res
            return;
        }
        nums.add(idx);

        combine(nums, res, idx+1, sum+idx, n, k-1);
        nums.remove(nums.size()-1);
        combine(nums, res,idx+1, sum,n,k);
    }
}
