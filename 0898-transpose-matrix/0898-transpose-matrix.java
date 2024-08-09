class Solution {
    public int[][] transpose(int[][] matrix) {
        int l = matrix.length;
        int b = matrix[0].length;
        int[][] transpose = new int[b][l];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < b; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
}