package Top_Interview_150;
import java.util.*;

// 88. Merge Sorted Array
//Easy

public class Merge_Sorted_Array {

    // O(m+n) Algorithm
//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        int i = 0,j = 0, idx = 0;
//        int[] res = new int[m+n];
//        while(idx < m+n){
//            if(j >= n){
//                res[idx++] = nums1[i];
//                i++;
//            }
//            else if(i >= m){
//                res[idx++] = nums2[j];
//                j++;
//            }
//            else if(nums1[i] <= nums2[j]) {
//                res[idx++] = nums1[i];
//                i++;
//            }
//            else {
//                res[idx++] = nums2[j];
//                j++;
//            }
//        }
//        for(int i1 = 0; i1 < nums1.length;i1++){
//            nums1[i1] = res[i1];
//        }
//    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, idx = m+n-1;
        while(j >= 0){
            if(i >= 0 && nums1[i] > nums2[j]){
                nums1[idx--] = nums1[i--];
            }
            else{
                nums1[idx--] = nums2[j--];
            }
        }
    }
}
