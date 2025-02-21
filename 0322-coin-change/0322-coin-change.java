class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] prev = new int[amount + 1];
        for (int a = 0; a < amount + 1; a++) {
            if (a % coins[0] == 0) {
                prev[a] = a / coins[0];
            } else {
                prev[a] = (int) 1e9;
            }
        }
        for (int i = 1; i < coins.length; i++) {
            int[] cur = new int[amount + 1];
            for (int a = 0; a < amount + 1; a++) {
                int pick = (int) 1e9;
                if (a >= coins[i]) {
                    pick = 1 + cur[a - coins[i]];
                }
                int noPick = prev[a];
                cur[a] = Math.min(pick, noPick);
            }
            prev = cur;
        }
        int result = prev[amount];
        return (result >= (int) 1e9) ? -1 : result;
    }
}
