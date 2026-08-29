class Solution {
    public int maxProfit(int[] prices) {
        int cp = prices[0]; // buy before sell (cp - cost price)
        int maxProfit = 0;

        for(int i=1; i<prices.length; i++) {
            if(prices[i] <= cp) {
                cp = prices[i];
            }
            else {
                maxProfit = Math.max(maxProfit, prices[i]-cp);
            }
        }
        return maxProfit;
    }
}
