class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int l = mat.length;
        int b = mat[0].length;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < b; j++) {
                int top, down, right, left, element;
                element = mat[i][j];
                top = i - 1 >= 0 ? mat[i - 1][j] : -1;
                down = i + 1 < l ? mat[i + 1][j] : -1;
                left = j - 1 >= 0 ? mat[i][j - 1] : 1;
                right = j + 1 < b ? mat[i][j + 1] : -1;

                if(element > top && element > down && element > right && element > left){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}