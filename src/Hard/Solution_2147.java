package Hard;

import java.util.ArrayList;
import java.util.List;

public class Solution_2147 {
    public int numberOfWays(String corridor) {
        long mod = 1000000007;
        long res = 1;
        List<Integer> idxs = new ArrayList<>();
        for(int i = 0 ; i < corridor.length();i++){
            if(corridor.charAt(i) == 'S')
                idxs.add(i);
        }
        if(idxs.size() % 2 != 0 || idxs.isEmpty())
            return 0;

        for(int i = 2; i < idxs.size();i+=2){
            res *= (idxs.get(i) - idxs.get(i-1));
            res %= mod;
        }
        return (int) res;
    }
}
