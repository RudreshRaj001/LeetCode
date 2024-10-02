class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int l = mat.length;
        int b = mat[0].length;
        /*

          00 01 02
          10 11 12
          20 21 22

         */
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < b; j++) {
                int top, down, right, left, element;
                element = mat[i][j];
                if(i - 1 >= 0){
                    top = mat[i - 1][j];
                }else{
                    top = -1;
                }
                if(i + 1 < l){
                    down = mat[i + 1][j];
                }else{
                    down = -1;
                }

                if(j - 1 >= 0){
                    left = mat[i][j - 1];
                }else{
                    left = -1;
                }

                if(j + 1 < b){
                    right = mat[i][j + 1];
                }else{
                    right = -1;
                }

                if(element > top && element > down && element > right && element > left){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}