package Medium;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/determine-if-two-strings-are-close/description/?envType=study-plan-v2&envId=leetcode-75
// Determine if Two Strings Are Close
public class Solution_1657 {
    public boolean closeStrings(String word1, String word2) {
        Set<Character> set = new HashSet<>();
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for (char i : word1.toCharArray()){
            set.add(i);
            arr1[i-'a']++;
        }
        for (char i : word2.toCharArray()){
            arr2[i-'a']++;
            if (!set.contains(i))
                return false;
        }
        Arrays.sort(arr2);
        Arrays.sort(arr1);
        for(int i = 0;i < 26;i++){
            if(arr2[i] != arr1[i])
                return false;
        }
        return true;
    }
}
