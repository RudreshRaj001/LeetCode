class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Method 1:
        int rows = matrix.length;
        int columns = matrix[0].length;
        int left = 0;
        int right = rows * columns - 1;
        while(left <= right){
        int mid = right + (left - right) / 2;
        int mid_val = matrix[mid / columns][mid % columns];
        // mid / n -> row index of value
        // mid % n -> col index of value
        if(mid_val == target){
        return true;
        }else if(mid_val < target){
        left = mid + 1;
        }else{
        right = mid - 1;
        }
        }
        return false;

        // // Method 2:
        // int r = 0;
        // int c = matrix[0].length - 1; // be cautious matrix might be empty

        // while ((r < matrix.length) && (c >= 0)) {
        // if (matrix[r][c] == target) {
        // return true;
        // } else if (matrix[r][c] > target) {
        // c--;
        // } else {
        // r++;
        // }
        // }

        // return false;

    }
}