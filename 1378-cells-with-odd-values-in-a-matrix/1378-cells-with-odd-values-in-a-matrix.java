class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] array = new int[m][n];
        int odd = 0;
        for (int i = 0; i < indices.length; i++) {
            int row = indices[i][0];
            int col = indices[i][1];
            for (int j = 0; j < n; j++) {
                array[row][j]++;
            }
            for (int k = 0; k < m; k++) {
                array[k][col]++;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(array[i][j]%2 != 0){
                    odd++;
                }
            }
        }

        return odd;
    }
}