class Solution {
    public int diagonalSum(int[][] mat) {
        int length = mat.length;
        int sum = 0;
        for(int i = 0; i < length; i++){
            sum += mat[i][i];
        }
        for(int i = 0; i < length; i++){
            sum += mat[i][length-1-i];
        }
        if(length%2 != 0){
            sum -= mat[length/2][length/2];
        }
        return sum;
    }
}