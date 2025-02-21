class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length][amount + 1];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        int result = coin(coins, amount, coins.length - 1, dp);
        return (result >= (int) 1e9) ? -1 : result;
    }

    private int coin(int[] coins, int amount, int index, int[][] dp) {
        if (index == 0) {
            if (amount % coins[index] == 0){
                return amount / coins[index];
            } 
            return (int) 1e9;
        }

        if(dp[index][amount] != -1){
            return dp[index][amount];
        }

        int pick = (int) 1e9;
        if (amount >= coins[index]) {
            pick = 1 + coin(coins, amount - coins[index], index, dp);
        }
        int noPick = coin(coins, amount, index - 1, dp);

        return dp[index][amount] = Math.min(pick, noPick);
    }
}
