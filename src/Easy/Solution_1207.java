package Easy;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// https://leetcode.com/problems/unique-number-of-occurrences/description/?envType=study-plan-v2&envId=leetcode-75
// Unique Number of Occurrences
public class Solution_1207 {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> occurrences = new HashMap<>();
        for(int i : arr){
            occurrences.put(i, occurrences.getOrDefault(i,0) + 1);
        }

        Set<Integer> unique = new HashSet<>();
        for (Integer key : occurrences.keySet()){
            int occurrence = occurrences.get(key);
            if(unique.contains(occurrence)){
                return false;
            }
            unique.add(occurrence);
        }
        return true;
    }
}
