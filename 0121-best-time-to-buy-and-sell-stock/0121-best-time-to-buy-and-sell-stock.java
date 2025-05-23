class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int profit = 0;
        while(r < prices.length){
            profit = Math.max(profit, prices[r] - prices[l]);
            if(prices[r] < prices[l]){
                l = r;
            }
            r++;
        }
        return profit;
    }
}