package Top_Interview_150;
import java.util.*;

// 121. Best Time to Buy and Sell Stock
// Easy

public class Best_Time_To_Buy_And_Sell_Stock {
    public int maxProfit(int[] prices) {
        int buy = prices[0] ;
        int profit = 0;
        for(int i = 1; i <prices.length;i++){
            buy = Math.min(buy, prices[i]);
            profit = Math.max(profit, prices[i] - buy);
        }
        return profit;
    }
}
