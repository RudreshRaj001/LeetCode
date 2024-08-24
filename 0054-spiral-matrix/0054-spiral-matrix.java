class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0;
        int right = matrix[0].length;
        int top = 0;
        int down =  matrix.length;
        List<Integer> result = new ArrayList<>();
        while(left < right && top < down){
            // get every i in the top row
            for(int i = left; i < right; i++){
                result.add(matrix[top][i]);
            }
            top++;

            // get every i in the right col
            for(int i = top; i < down; i++){
                result.add(matrix[i][right - 1]);
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
                result.add(matrix[down - 1][i]);
            }
            down--;

            // get every i in the left col
            for(int i = down - 1; i > top - 1; i--){
                result.add(matrix[i][left]);
            }
            left++;
        }
        return result;
    }
}