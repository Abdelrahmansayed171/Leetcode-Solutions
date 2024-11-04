package Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution_17 {
    /*List<String> res = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty())
            return new ArrayList<>();
        String[] digitStrings = {
                "",     // 0 (no letters for 0)
                "",     // 1 (no letters for 1)
                "abc",  // 2
                "def",  // 3
                "ghi",  // 4
                "jkl",  // 5
                "mno",  // 6
                "pqrs", // 7
                "tuv",  // 8
                "wxyz"  // 9
        };
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
    }*/
        public List<String> letterCombinations(String digits) {
            List<String> res = new ArrayList<>();

            if (digits == null || digits.length() == 0) {
                return res;
            }

            Map<Character, String> digitToLetters = new HashMap<>();
            digitToLetters.put('2', "abc");
            digitToLetters.put('3', "def");
            digitToLetters.put('4', "ghi");
            digitToLetters.put('5', "jkl");
            digitToLetters.put('6', "mno");
            digitToLetters.put('7', "pqrs");
            digitToLetters.put('8', "tuv");
            digitToLetters.put('9', "wxyz");

            backtrack(digits, 0, new StringBuilder(), res, digitToLetters);

            return res;
        }

        private void backtrack(String digits, int idx, StringBuilder comb, List<String> res, Map<Character, String> digitToLetters) {
            if (idx == digits.length()) {
                res.add(comb.toString());
                return;
            }

            String letters = digitToLetters.get(digits.charAt(idx));
            for (char letter : letters.toCharArray()) {
                comb.append(letter);
                backtrack(digits, idx + 1, comb, res, digitToLetters);
                comb.deleteCharAt(comb.length() - 1);
            }
        }

}
