class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if(len<=1) return 0;
        int bp = prices[0];
        int profit = 0;
        for(int i = 1; i < len; i++){
            if(bp > prices[i]){
                bp = prices[i];
            }else{
                int newprofit = prices[i] - bp;
                if(profit < newprofit) {
                    profit  = newprofit;
                }
            }
        }
        return profit;
    }
}