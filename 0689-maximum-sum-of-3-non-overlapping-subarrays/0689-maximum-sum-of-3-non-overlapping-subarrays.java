class Solution {
    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        int n = nums.length;
        int[] sum = new int[n - k + 1];
        int[] left = new int[n - k + 1];
        int[] right = new int[n - k + 1];

        // 0 3 3 3 8 13 12 6
        int currentSum = 0;
        for (int i = 0; i < n; i++) {
            currentSum += nums[i];
            if (i >= k) currentSum -= nums[i - k];
            if (i >= k - 1) sum[i - k + 1] = currentSum;
        }

        // 0 3 3 3 8 13 13 13 
        int bestLeft = 0;
        for (int i = 0; i < sum.length; i++) {
            if (sum[i] > sum[bestLeft]) bestLeft = i;
            left[i] = bestLeft;
        }

        // 13 13 13 13 13 13 12 6
        int bestRight = sum.length - 1;
        for (int i = sum.length - 1; i >= 0; i--) {
            if (sum[i] >= sum[bestRight]) bestRight = i;
            right[i] = bestRight;
        }

        // middle = k
        // 0  3  3  3  8  13 13 13 (left) best
        // 0  3  3  3  8  13 12 6  (sum)
        // 13 13 13 13 13 13 12 6  (right) best
        // k = 2

        // left middle right

        int maxSum = 0;
        int[] result = new int[3];
        
        for (int middle = k; middle < sum.length - k; middle++) {

            int l = left[middle - k]; // 

            int r = right[middle + k]; //
            
            int total = sum[l] + sum[middle] + sum[r];

            if (total > maxSum) {
                maxSum = total;
                result[0] = l;
                result[1] = middle;
                result[2] = r;
            }
        }

        return result;
    }
}
