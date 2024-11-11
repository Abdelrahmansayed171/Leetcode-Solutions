package Medium;

public class Solution_1318 {
    public int minFlips(int a, int b, int c) {
        int res = 0;
        while(a > 0 || b > 0 || c > 0){
            if((c&1) == 1 && (a&1) == 0 && (b&1) == 0)
                res++;
            if((c&1) == 0)
                res += (a&1) + (b&1);
            a>>=1 ; b>>=1; c>>=1;
        }
        return res;
    }
}
