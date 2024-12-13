class Solution {
    public long findScore(int[] nums) {
        int n = nums.length;
        int[][] array = new int[n][2];
        for (int i = 0; i < n; i++) {
            array[i][0] = nums[i];
            array[i][1] = i;
        }
        Arrays.sort(array, (a, b) -> a[0] - b[0]);

        boolean[] marked = new boolean[n];
        long result = 0;
        for (int[] arr : array) {
            int val = arr[0];
            int ind = arr[1];
            if (!marked[ind]) {
                result += val;

                marked[ind] = true;
                if (ind > 0)
                    marked[ind - 1] = true;
                if (ind < n - 1) 
                    marked[ind + 1] = true;
            }
        }
        return result;
    }
}