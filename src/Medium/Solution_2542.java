package Medium;

import java.util.Arrays;
import java.util.PriorityQueue;
// solution video link: https://www.youtube.com/watch?v=ax1DKi5lJwk

public class Solution_2542 {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int size = nums1.length;

        // creates 2 arrays as a set of pairs
        int[][] pairs = new int[size][2];
        for(int i = 0;i < size;i++){
            pairs[i][0] = nums1[i];
            pairs[i][1] = nums2[i];
        }

        // sort pairs according to second array (nums2) in descending order
        Arrays.sort(pairs, (a,b) -> b[1]-a[1]);

        // creates min heap to pop minimum possible number
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k, (a,b)-> a-b);

        // handle sum of 1st array subsequences
       long maxSum = 0;
       long sum = 0;
        for (int i = 0;i < size;i++){
            minHeap.offer(pairs[i][0]);
            sum+= pairs[i][0];
            if( minHeap.size() > k)
                sum -= minHeap.poll();
            if(minHeap.size() == k)
                maxSum  = Math.max(maxSum, sum * pairs[i][1]);
        }
        return maxSum;
    }
}
