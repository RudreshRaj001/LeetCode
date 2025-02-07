class Solution {
    public void gameOfLife(int[][] board) {
        int n = board.length;
        int m = board[0].length;

        int[][] copy = new int[n][m];
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++){
                copy[i][j] = board[i][j];
            }
        }

        int i = 0;
        int j = 0;
        while (i < n) {
            j = 0;
            while (j < m) {
                int cnt = 0;
                if(i - 1 >= 0 && j - 1 >= 0){
                    cnt +=  copy[i - 1][j - 1];
                }
                if(i - 1 >= 0){
                    cnt +=  copy[i - 1][j];
                }
                if(i - 1 >= 0 && j + 1 < m){
                    cnt +=  copy[i - 1][j + 1];
                }
                if(j - 1 >= 0){
                    cnt +=  copy[i][j - 1];
                } 
                if(j + 1 < m){
                    cnt +=  copy[i][j + 1];
                }
                if(i + 1 < n && j - 1 >= 0){
                    cnt +=  copy[i + 1][j - 1];
                }
                if(i + 1 < n){
                    cnt +=  copy[i + 1][j];
                }
                if(i + 1 < n && j + 1 < m){
                    cnt +=  copy[i + 1][j + 1];
                }

                if(cnt < 2){
                    board[i][j] = 0;
                }else if(board[i][j] == 1 && (cnt == 2 || cnt == 3)){
                    board[i][j] = 1;
                }else if(cnt == 3){
                    board[i][j] = 1;
                }else if(cnt > 3){
                    board[i][j] = 0;
                }
                // if(board[i][j]==1){
                //     if(cnt<2){
                //         board[i][j]=0;
                //     }
                //     else if(cnt>3){
                //         board[i][j]=0;
                //     }
                // }
                // else{
                //    if(cnt==3){
                //         board[i][j]=1;
                //     } 
                // }

                j++;
            }
            i++;
        }
    }
}