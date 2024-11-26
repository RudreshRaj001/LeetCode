class Solution {
    public int findChampion(int[][] grid) {
        int n = grid.length;
        int winner = 0;
        for(int i = 0; i < n; i++){
            // boolean flag = true;
            // for(int j = 0; j < n;j++){
            //     if(i == j) continue;
            //     if(grid[i][j] != 1){
            //         flag = false;
            //         break;
            //     }
            // }
            // if(flag) return i;
            if(winner == i) continue;
            if(grid[winner][i] == 0){
                winner = i;
            }
        }
    
        return winner;
    }
}