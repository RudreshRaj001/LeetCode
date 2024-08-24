class Solution {
    public int[][] generateMatrix(int n) {

        int[][] matrix = new int[n][n];

        int left = 0;
        int right = n;
        int top = 0;
        int down =  n;

        int num = 1;
        
        while(left < right && top < down){
            // get every i in the top row
            for(int i = left; i < right; i++){
               matrix[top][i] = num;
               num++;
            }
            top++;

            // get every i in the right col
            for(int i = top; i < down; i++){
                matrix[i][right - 1] = num;
                num++;
            }
            right--;

            if(!(left < right && top < down)){
                // if left becomes >= right
                // or top becomes >=  down
                // means the matrix has no more elements left to print
                break;
            }
            
             // get every i in the bottom row
            for(int i = right - 1; i > left - 1; i--){
                matrix[down - 1][i] =  num;
                num++;
            }
            down--;

            // get every i in the left col
            for(int i = down - 1; i > top - 1; i--){
                matrix[i][left] = num;
                num++;
            }
            left++;
        }
        return matrix;
    }
}