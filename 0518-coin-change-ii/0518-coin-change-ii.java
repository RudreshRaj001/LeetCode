class Solution {
    public int change(int amount, int[] coins) {
        int[] prev = new int[amount + 1];
        for (int a = 0; a < amount + 1; a++) {
            if (a % coins[0] == 0) {
                prev[a] = 1;
            } else {
                prev[a] = 0;
            }
        }
        for (int i = 1; i < coins.length; i++) {
            int[] cur = new int[amount + 1];
            for (int a = 0; a < amount + 1; a++) {
                int pick = 0;
                if (a >= coins[i]) {
                    pick = cur[a - coins[i]];
                }
                int noPick = prev[a];
                cur[a] = pick + noPick;
            }
            prev = cur;
        }

        return prev[amount];
    }
}