package Medium;

// Rotate Array (Optimized Reversal)
public class Solution_189 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k  %= n; // what if k is bigger than n ??!

        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }

    public void reverse(int[] nums, int b, int e){
        while( e > b){

            int tmp = nums[e];
            nums[e] = nums[b];
            nums[b] = tmp;

            b++;
            e--;
        }
    }
}
