package Top_Interview_150;
import java.util.*;

// 14. Longest Common Prefix
// Easy

public class Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length <= 1 || strs[0].isEmpty())
            return strs[0];
        int idx = 0;
        while (idx < strs[0].length()) {
            for (int i = 1; i < strs.length; i++) {
                if (idx < strs[i].length() && strs[i].charAt(idx) != strs[i - 1].charAt(idx))
                    return strs[0].substring(0, idx);
            }
            idx++;
        }
        return strs[0].substring(0, idx - 1);
    }
}
