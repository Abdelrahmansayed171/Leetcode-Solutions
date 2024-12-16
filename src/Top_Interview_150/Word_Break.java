package Top_Interview_150;
import java.util.*;

// 139. Word Break
// Medium

public class Word_Break {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()+1];
        dp[s.length()] = true;
        for(int i =s.length()-1; i >= 0 ;i--){
            for(String word : wordDict){
                if(i + word.length() <= s.length() && s.startsWith(word,i))
                    dp[i] = dp[i+word.length()];
                if(dp[i])
                    break;
            }
        }
        return dp[0];
    }
}
