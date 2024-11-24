class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int n = 0;
        long sum = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                int num = matrix[i][j];
                if(num < 0){
                    n++;
                    num = -num;
                }
                sum += num;
                if(num < min){
                    min = num;
                }
            }
        }
        return n % 2 == 0 ? sum : sum - min*2;
    }
}