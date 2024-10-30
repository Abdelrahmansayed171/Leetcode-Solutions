package Medium;

import java.util.PriorityQueue;

public class Solution_215 {

    // QUICK-SELECT APPROACH AVG(O(n)), WORST(O(n*n))
    public int findKthLargest(int[] nums, int k) {
        // define start, end indexes
        int left = 0, right = nums.length-1;
        // Do our quick sort until we get element stored at nums.size - k index
        while(true){
            int pivot_index = (left+right)/2;
            int sorted_position = quickSelect(nums, left, right, pivot_index);
            if(nums.length - sorted_position == k)
                return nums[sorted_position];
            else if(nums.length - sorted_position > k)
                left = sorted_position + 1;
            else
                right = sorted_position -1;
        }
    }
    private int quickSelect(int[] nums, int left, int right, int pivot){
        swap(nums, pivot, right);
        int j = left;
        for(int i = left; i < right; i++){
            if(nums[i] < nums[right]){
                swap(nums, i,j);
                j++;
            }
        }
        swap(nums,right, j);
        return j;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // MAX HEAP (Priority QUEUE) APPROACH O(n*log(n))

}
