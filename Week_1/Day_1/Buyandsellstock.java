package Week_1.Day_1;

public class Buyandsellstock {

    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int minprice = prices[0];
        for (int i = 0; i < prices.length; i++) {
            int profit = prices[i] - minprice;
            if (profit > maxprofit) {
                maxprofit = profit;
            }
            if (prices[i] < minprice) {
                minprice = prices[i];
            }
        }
        return maxprofit;

    }

}
