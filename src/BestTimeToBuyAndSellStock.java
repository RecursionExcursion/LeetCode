public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {7, 6, 4, 3, 1};
        int[] prices3 = {7, 6, 4, 3, 1};

        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {

        int lowestPrice = prices[0];
        int bestProfitLossMargin = 0;


        for (int i = 0; i < prices.length; i++) {
            lowestPrice = Math.min(lowestPrice, prices[i]);
            bestProfitLossMargin = Math.max(bestProfitLossMargin, prices[i] - lowestPrice);
        }
        return bestProfitLossMargin;
    }
}
