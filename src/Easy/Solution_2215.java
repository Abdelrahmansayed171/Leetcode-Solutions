package Easy;

// https://leetcode.com/problems/find-the-difference-of-two-arrays/description/?envType=study-plan-v2&envId=leetcode-75
// Find the Difference of Two Arrays


import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Solution_2215 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set_1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set_2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        List<Integer> ans1 = new ArrayList<>();
        List<Integer> ans2 = new ArrayList<>();
        for (Integer i : set_1){
            if(set_2.contains(i))
                continue;
            ans1.add(i);
        }
        for (Integer i : set_2){
            if(set_1.contains(i))
                continue;
            ans2.add(i);
        }
        return List.of(ans1,ans2);

        /*Map<Integer, Set<Integer>> index = new HashMap<>();
        for (int i : nums1){
            index.put(i, new HashSet<>());
            index.get(i).add(1);
        }
        for (int i : nums2) {
            index.putIfAbsent(i, new HashSet<>());
            index.get(i).add(2);
        }

        List<Integer> d1 = new ArrayList<>(), d2 = new ArrayList<>();

        for (Integer key: index.keySet()){
            if(index.get(key).size() > 1)
                continue;
            if(index.get(key).contains(1))
                d1.add(key);
            else
                d2.add(key);
        }
        return List.of(d1,d2);*/
    }
}
