package Medium;

import java.util.ArrayList;
import java.util.List;

public class Solution_17 {
    String[] digitStrings = new String[10];
    public Solution_17(){
        char next = 'a';
        for(int i = 2;i < 10;i++){
            digitStrings[i] = "";
            digitStrings[i] += next++;
            digitStrings[i] += next++;
            digitStrings[i] += next++;
            digitStrings[i] += i == 7 || i == 9? next++:"";
        }
    }
    List<String> res = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty())
            return new ArrayList<>();
        List<String> strings = new ArrayList<>();
        for(char c : digits.toCharArray()){
            System.out.println(c-'0');
            strings.add(digitStrings[c - '0']);
        }
        backtrack(strings, 0, "");
        return res;
    }

    private void backtrack(List<String> strings, int idx, String s) {
        if(idx == strings.size()) {
            res.add(s);
            return;
        }
        for(int i = 0; i < strings.get(idx).length() ;i++)
            backtrack(strings, idx+1, s + strings.get(idx).charAt(i));
    }
}
