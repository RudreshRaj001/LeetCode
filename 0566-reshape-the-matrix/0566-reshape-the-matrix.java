class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int l = mat.length;
        int b = mat[0].length;

        if ((l * b) != (r * c))
            return mat;

        int[][] ans = new int[r][c];
        int output_rows = 0;
        int output_cols = 0;

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < b; j++) {
                ans[output_rows][output_cols] = mat[i][j];
                output_cols++;

                // if the cols value reached then change the row and set the cols value to 0.
                if (output_cols == c) {
                    output_cols = 0;
                    output_rows++;
                }
            }
        }

        return ans;
    }
}