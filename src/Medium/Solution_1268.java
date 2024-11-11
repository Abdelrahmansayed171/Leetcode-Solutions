package Medium;

import java.util.*;

public class Solution_1268 {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<List<String>> result = new ArrayList<>();
        Set<String> tmp = new HashSet<>();
        for(int j = 0; j < searchWord.length() ;j++){
            char c = searchWord.charAt(j);
            List<String> list = new ArrayList<>();
            for(int i = 0 ; i < products.length;i++){
                if(j == 0 && c == products[i].charAt(j))
                    tmp.add(products[i]);
                if(j < products[i].length() && products[i].charAt(j) == c && tmp.contains(products[i]) )
                    list.add(products[i]);
            }
            if(list.size() > 3) {
                List<String> sublist = new ArrayList<>();
                sublist.add(list.get(0)); sublist.add(list.get(1)); sublist.add(list.get(2));
                result.add(sublist);
            }
            else
                result.add(list);
        }
        return result;
    }
}
