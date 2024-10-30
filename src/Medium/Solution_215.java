package Medium;

public class Solution_215 {

    // QUICK-SELECT APPROACH AVG(O(n)), WORST(O(n*n))
    public int findKthLargest(int[] nums, int k) {
        int left = 0, right = nums.length-1;
        while(true){
            int pivot_index = (left+right)/2;

        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // MAX HEAP APPROACH O(n*log(n))

}
