class Solution {
    public long gridGame(int[][] grid) {
        int n = grid[0].length;
        long[] preR1 = new long[n];
        long[] preR2 = new long[n];
        preR1[0] = grid[0][0];
        preR2[0] = grid[1][0];
        for(int i = 1; i < n; i++){
           preR1[i] = grid[0][i] + preR1[i - 1];
           preR2[i] = grid[1][i] + preR2[i - 1]; 
        }
        long res = Long.MAX_VALUE;
        for(int i = 0; i < n; i++){
            long r1 = preR1[n-1] - preR1[i];
            long r2 = i > 0 ? preR2[i-1] : 0;
            long take = Math.max(r1,r2);
            res = Math.min(res, take);
        }
        return res;
    }
}