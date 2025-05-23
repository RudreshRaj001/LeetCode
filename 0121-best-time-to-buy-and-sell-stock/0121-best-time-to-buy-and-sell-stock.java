class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int profit = 0;
        while(r < prices.length){
            while(r + 1 < prices.length && prices[r] < prices[r + 1]){
                if(prices[r] < prices[l]){
                    l = r;
                }
                r++;
            } 
            profit = Math.max(profit, prices[r] - prices[l]);
            r++;
        }
        return profit;
    }
}