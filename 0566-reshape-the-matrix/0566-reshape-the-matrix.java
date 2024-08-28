class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int l = mat.length;
        int b = mat[0].length;

        if((l * b) != (r * c)) return mat;

        int[][] ans = new int[r][c];
        int output_rows = 0;
        int output_cols = 0;

        int i = 0;
        while(i < l){
            int j = 0;
            while(j < b){
                ans[output_rows][output_cols] = mat[i][j];
                output_cols++;
                if(output_cols == c){
                    output_cols = 0;
                    output_rows++;
                }
                j++;
            }
            i++;
        }
        return ans;
    }
}