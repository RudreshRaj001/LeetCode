class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for(int i = 1; i < prices.length; i++){
            int tempProfit = prices[i] - buy;
            if(tempProfit > profit){
                profit = tempProfit;
            }
            if(prices[i] < buy){
                buy = prices[i];
            }
        }
        return profit;
    }
}