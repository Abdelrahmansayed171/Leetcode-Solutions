package Top_Interview_150;
import java.util.*;

// 322. Coin Change
// Medium

public class Coin_Change {
    public int coinChange(int[] coins, int amount) {
        int[] dpCache = new int[amount+1];
        Arrays.fill(dpCache, Integer.MAX_VALUE-1);
        dpCache[0] = 0;
        for(int money = 1; money <= amount;money++){
            for (int coin : coins) {
                if (money - coin >= 0) {
                    dpCache[money] = Math.min(dpCache[money], dpCache[money - coin] + 1);
                }
            }
        }
        return dpCache[amount] == Integer.MAX_VALUE-1 ? -1 : dpCache[amount];
    }
}
