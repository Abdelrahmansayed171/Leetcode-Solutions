package Medium;

public class Solution_134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0;
        for(int i = 0 ;i < gas.length;i++){
            sum += gas[i] - cost[i];
        }
        if(sum < 0)
            return -1;

        int tank =0, ans = 0;
        for(int i =  0; i < gas.length; i ++){
            tank += gas[i] - cost[i];
            if(tank < 0){
                tank = 0;
                ans = i + 1;
            }
        }
        return ans;
    }
}
