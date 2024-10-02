class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int l = mat.length;
        int b = mat[0].length;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < b; j++) {
                int element = mat[i][j];
                int top = i - 1 >= 0 ? mat[i - 1][j] : -1;
                int down = i + 1 < l ? mat[i + 1][j] : -1;
                int left = j - 1 >= 0 ? mat[i][j - 1] : 1;
                int right = j + 1 < b ? mat[i][j + 1] : -1;

                if(element > top && element > down && element > right && element > left){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}