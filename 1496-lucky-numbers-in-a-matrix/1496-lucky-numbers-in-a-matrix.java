class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int l = matrix.length; // -> tells how many rows
        int b = matrix[0].length; // -> tells how many cols

        int[] row_minimum = new int[l];
        Arrays.fill(row_minimum, Integer.MAX_VALUE);
        int[] col_maximum = new int[b];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < b; j++) {
                int element = matrix[i][j];
                row_minimum[i] = Math.min(row_minimum[i], element);
                col_maximum[j] = Math.max(col_maximum[j], element);
            }
        }

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < b; j++) {
                int element = matrix[i][j];
                if (element == row_minimum[i] && element == col_maximum[j]) {
                    return Collections.singletonList(element);
                }
            }
        }
        return Collections.emptyList();
    }
}