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
        while(k-- > 0){
            if(rightGroup.isEmpty()){
                sum += leftGroup.poll();
            }
            else if (leftGroup.isEmpty()){
                sum+= rightGroup.poll();
            }
            else{
                int lp = leftGroup.peek(), rp = rightGroup.peek();
                if(lp <= rp) {
                    sum += leftGroup.poll();
                    if(left <= right)
                        leftGroup.offer(costs[left++]);
                }
                else{
                    sum+= rightGroup.poll();
                    if(right >= left)
                        rightGroup.offer(costs[right--]);
                }
            }
        }
        return sum;
    }
}
