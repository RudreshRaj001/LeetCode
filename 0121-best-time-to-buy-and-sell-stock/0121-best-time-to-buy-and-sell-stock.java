class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;

        int profit = 0;

        while(r < prices.length){
            profit = Math.max(prices[r] - prices[l], profit);
            if(prices[r] < prices[l]){
                l = r;
            }
            r++;
        }

        return profit;
    }
}