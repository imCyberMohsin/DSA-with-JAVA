//! Best time to buy and sell stock 
// Code360: https://www.naukri.com/code360/problems/stocks-are-profitable_893405

import java.util.*;

public class Best_time_to_buy_and_sell_stock_I {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 100, 150, 120)); // Output: 148

        System.out.println(maximumProfit(list));
    }

    // ! Functions
    public static int maximumProfit(ArrayList<Integer> prices) {
        int buyPrice = prices.get(0);
        int maxProfit = 0;
        for (int i = 1; i < prices.size(); i++) {
            // Update Buy Price if current is less
            if (prices.get(i) < buyPrice) {
                buyPrice = prices.get(i);
            } else {
                // Calculating current profit
                int currentProfit = prices.get(i) - buyPrice;
                // Update the maxProfit if the currentProfit is greater
                if (currentProfit > maxProfit) {
                    maxProfit = currentProfit;
                }
            } 
        }
        return maxProfit;
    }
}
