class Solution {
    public int findChampion(int[][] grid) {
        // int n = grid.length;
        // int winner = 0;

        // //    A B C
        // // A [0,0,1]
        // // B [1,0,1]
        // // C [0,0,0]

        // // Winner -> has to win against all team

        // for(int i = 0; i < n; i++){
        //     if(winner == i) continue;
        //     if(grid[winner][i] == 0){
        //         winner = i;
        //     }
        // }
    
        // return winner;

        int n = grid.length;
        for(int i = 0; i < n; i++){
            boolean flag = true;
            for(int j = 0; j < n;j++){
                if(i == j) continue;
                if(grid[i][j] != 1){
                    flag = false;
                    break;
                }
            }
            if(flag) return i;
        }
    
        return -1;
    }
}