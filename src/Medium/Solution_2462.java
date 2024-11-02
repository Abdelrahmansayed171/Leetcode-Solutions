package Medium;

import java.util.PriorityQueue;

public class Solution_2462 {
    public long totalCost(int[] costs, int k, int candidates) {
        int size = costs.length;
        int left = 0, right = size-1;
        PriorityQueue<Integer> leftGroup = new PriorityQueue(candidates), rightGroup = new PriorityQueue<>(candidates);
        while( left < candidates){
            leftGroup.offer(costs[left]);
            left++;
        }
        while (right >= left && right >= size-candidates){
            rightGroup.offer(costs[right]);
            right--;
        }
        long sum = 0;
        boolean lturn = true;
        while(k-- > 0){
            if(lturn && leftGroup.isEmpty() || !lturn && rightGroup.isEmpty())
                lturn = !lturn;
            if(lturn) {
                sum += leftGroup.poll();
                if(left <= right)
                    leftGroup.offer(costs[left++]);
            }
            else {
                sum+= rightGroup.poll();
                if(right >= left)
                    rightGroup.offer(costs[right--]);
            }
            lturn = !lturn;
        }
        return sum;
    }
}
