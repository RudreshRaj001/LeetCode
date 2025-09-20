class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        int i = 0;
        int j = i;
        while(j < prices.length){
            while(j + 1 < prices.length && prices[j] < prices[j + 1]){
                j++;
            }
            int prof = prices[j] - prices[i];
            if(prof > 0){
                res += prof;
            }
            i = j + 1;
            j = i;
        }
        return res;
    }
}