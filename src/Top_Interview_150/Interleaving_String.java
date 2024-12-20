package Top_Interview_150;
import java.util.*;

// 97. Interleaving String
//Medium

public class Interleaving_String {

    // DFS with Memoization Solution
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length()+s2.length() != s3.length())
            return false;

        Map<String, Boolean> memo = new HashMap<>();
        return dfs(memo, 0, 0, s1, s2, s3);
    }

    private boolean dfs(Map<String, Boolean> memo, int i, int j, String s1, String s2, String s3) {
        if(i+j == s3.length())
            return true;

        String key = i + " " + j;

        if(memo.containsKey(key))
            return memo.get(key);

        if( i < s1.length() && s1.charAt(i) == s3.charAt(i+j) && dfs(memo,i+1, j, s1,s2,s3))
            return true;

        if(j < s2.length() && s2.charAt(j) == s3.charAt(i+j) && dfs(memo,i, j+1, s1,s2,s3))
            return true;
        memo.put(key, false);
        return false;
    }
}
