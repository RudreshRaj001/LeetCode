class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length][amount + 1];
        for (int a = 0; a < amount + 1; a++) {
            if (a % coins[0] == 0) {
                dp[0][a] = a / coins[0];
            } else {
                dp[0][a] = (int) 1e9;
            }
        }
        for (int i = 1; i < coins.length; i++) {
            for (int a = 0; a < amount + 1; a++) {
                int pick = (int) 1e9;
                if (a >= coins[i]) {
                    pick = 1 + dp[i][a - coins[i]];
                }
                int noPick = dp[i - 1][a];
                dp[i][a] = Math.min(pick, noPick);
            }
        }
        int result = dp[coins.length - 1][amount];
        return (result >= (int) 1e9) ? -1 : result;
    }
}
