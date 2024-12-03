class Solution {
    public int findChampion(int[][] grid) {
        int len = grid.length;
        for (int i = 0; i < len; i++) {
            boolean champ = true;
            for (int j = 0; j < len; j++) {
                if(i == j) continue;
                if(grid[i][j] != 1){
                    champ = false;
                    break;
                }
            }
            if(champ) return i;
        }
        return -1;
    }
}