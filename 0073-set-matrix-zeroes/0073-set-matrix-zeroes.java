class Solution {
    public void setZeroes(int[][] matrix) {
        int l = matrix.length;
        int b = matrix[0].length;
        int[] rows = new int[l];
        int[] cols = new int[b];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < b; j++) {
                if(matrix[i][j] == 0){
                    rows[i] = 1;
                    cols[j] = 1;
                }
            }
        }
        for(int i = 0; i < l; i++){
            if(rows[i] == 1){
                setRow(matrix, i, l, b);
            }
        }
        for(int i = 0; i < b; i++){
            if(cols[i] == 1){
                setCol(matrix, i, l, b);
            }
        }
    }
    public void setRow(int[][] matrix, int row, int l, int b){
        for(int i = 0; i < b; i++){
            matrix[row][i] = 0;
        }
    }
    public void setCol(int[][] matrix, int col, int l, int b){
        for(int i = 0; i < l; i++){
            matrix[i][col] = 0;
        }
    }
}