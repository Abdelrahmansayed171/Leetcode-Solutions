package Top_Interview_150;
import java.util.*;

// 13. Roman to Integer
// Easy

public class Roman_to_Integer {
    public int romanToInt(String s) {
        int res = 0;
        for(int i = 0; i < s.length(); i++){
            res += romanVal(s.charAt(i));
            if( i - 1 >= 0 && romanVal(s.charAt(i)) > romanVal(s.charAt(i-1)))
                res -= romanVal(s.charAt(i-1))*2;
        }
        return res;
    }
    private int romanVal(Character c){
        if(c == 'I')
            return 1;
        if(c == 'V')
            return 5;
        if(c == 'X')
            return 10;

        if(c == 'L')
            return 50;

        if(c == 'C')
            return 100;

        if(c == 'D')
            return 500;
        if(c == 'M')
            return 1000;
        return 0;
    }
}
