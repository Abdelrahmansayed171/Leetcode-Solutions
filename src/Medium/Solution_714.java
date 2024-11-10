package Medium;

public class Solution_714 {
    public int maxProfit(int[] prices, int fee) {
        int capital_reminder = Integer.MIN_VALUE, profit = 0;
        for(int price : prices){
            capital_reminder = Math.max(capital_reminder, profit - price);
            profit = Math.max(profit, capital_reminder + price - fee);
        }
        return profit;
    }
}
