class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<=1) return 0;
        int buy = prices[0];
        int profit = 0;
        for(int i = 1; i < prices.length; i++){
            // int tempProfit = prices[i] - buy;
            // if(tempProfit > profit){
            //     profit = tempProfit;
            // }
            // if(prices[i] < buy){
            //     buy = prices[i];
            // }
            if(buy > prices[i]){
                buy = prices[i];
            }else{
                int newProfit = prices[i] - buy;
                if(profit < newProfit){
                    profit = newProfit;
                }
            }
        }
        return profit;
    }
}