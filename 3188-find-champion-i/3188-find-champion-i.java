class Solution {
    public int findChampion(int[][] grid) {
        int n = grid.length;
        int winner = 0;
        for(int i = 0; i < n; i++){
            if(winner == i) continue;
            if(grid[winner][i] == 0){
                winner = i;
            }
        }
        return winner;
    }
}