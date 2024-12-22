package Top_Interview_150;
import java.util.*;

// 58. Length of Last Word
// Easy

public class Length_Of_Last_Word {
    public int lengthOfLastWord(String s) {
        int cnt = 0;
        boolean stop = false;
        for(int i = s.length()-1;i >= 0; i--){
            if(stop && s.charAt(i) == ' ')
                return cnt;
            if(s.charAt(i) != ' ') {
                cnt++;
                stop = true;
            }
        }
        return cnt;
    }
}
