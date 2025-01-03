class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        boolean[][] board = new boolean[n][n];

        ans.addAll(queens(board, 0));
        return ans;
    }

   
  static List<List<String>> queens(boolean[][] board, int row){
    if(row == board.length){
      List<List<String>> b = new ArrayList<>();
      b.add(display(board));
      return b;
    }

    List<List<String>> ans = new ArrayList<>();
    // placing the queen and checking the row and col
    for(int col = 0; col < board.length; col++){
      // place the queen if it is safe
      if(isSafe(board, row, col)){
        board[row][col] = true;
        ans.addAll(queens(board, row + 1));
        board[row][col] = false;
      }
    }

    return ans;
  }
  static List<String> display(boolean[][] board){
    List<String> ans = new ArrayList<>();
    for(boolean[] b : board){
      StringBuilder str = new StringBuilder();
      for(boolean p : b){
        if(p){
          str.append('Q');
        }else{
          str.append('.'); 
        }
      }
      ans.add(str.toString());
    }
    return ans;
  }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // check vertical row
        for(int i = 0; i < row; i++) {
          if(board[i][col]) return false;
        }

        // check left diagonal
        int maxLeft = Math.min(row, col);
        for(int i = 1; i <= maxLeft; i++){
          if(board[row - i][col - i]) return false;
        }

        // check right diagonal
        int maxRight = Math.min(row, board[0].length - col - 1);
        for(int i = 1; i <= maxRight; i++){
          if(board[row - i][col + i]) return false;
        }
        
        return true;
    }
}