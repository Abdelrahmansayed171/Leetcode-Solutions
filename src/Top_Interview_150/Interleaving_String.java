package Top_Interview_150;
import java.util.*;

// 97. Interleaving String
//Medium

public class Interleaving_String {
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length() + s2.length() != s3.length())
            return false;
        List<Character> l = new ArrayList<>(),r = new ArrayList<>();
        for(Character c : s1.toCharArray()){
            l.add(c);
        }
        for(Character c : s2.toCharArray()){
            l.add(c);
        }
        for(Character c : s3.toCharArray()){
            r.add(c);
        }
        l.sort(Comparator.naturalOrder());
        r.sort(Comparator.naturalOrder());
        for(int i = 0; i < l.size();i++){
            if(!l.get(i).equals(r.get(i)))
                return false;
        }
        return true;
    }
}
