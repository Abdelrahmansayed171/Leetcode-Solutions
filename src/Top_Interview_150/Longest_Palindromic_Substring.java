package Top_Interview_150;
import java.util.*;

// 5. Longest Palindromic Substring
// Medium

public class Longest_Palindromic_Substring {
    public String longestPalindrome(String s) {
        String lps = "";
        int lpsLen = 0;
        int start, end;
        for(int i = 0; i < s.length();i++){
            start = i;end = i;
            while(start >=0 && end < s.length() && s.charAt(start) == s.charAt(end)){
                if(end-start+1 > lpsLen){
                    lpsLen = end-start+1;
                    lps = s.substring(start, end+1);
                }
                start--;
                end++;
            }
            start = i; end = i+1;
            while(start >=0 && end < s.length() && s.charAt(start) == s.charAt(end)){
                if(end-start+1 > lpsLen){
                    lpsLen = end-start+1;
                    lps = s.substring(start, end+1);
                }
                start--;
                end++;
            }
        }
        return lps;
    }
}
