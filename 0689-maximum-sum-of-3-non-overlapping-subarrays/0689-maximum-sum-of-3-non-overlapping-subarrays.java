class Solution {
    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        int n = nums.length;
        int[] sum = new int[n - k + 1];
        int[] left = new int[n - k + 1];
        int[] right = new int[n - k + 1];
        int[] result = new int[3];

        // Compute sum of all subarrays of size k
        int currentSum = 0;
        for (int i = 0; i < n; i++) {
            currentSum += nums[i];
            if (i >= k) currentSum -= nums[i - k];
            if (i >= k - 1) sum[i - k + 1] = currentSum;
        }

        // Fill left array (best subarray on the left of each position)
        int bestLeft = 0;
        for (int i = 0; i < sum.length; i++) {
            if (sum[i] > sum[bestLeft]) bestLeft = i;
            left[i] = bestLeft;
        }

        // Fill right array (best subarray on the right of each position)
        int bestRight = sum.length - 1;
        for (int i = sum.length - 1; i >= 0; i--) {
            if (sum[i] >= sum[bestRight]) bestRight = i;
            right[i] = bestRight;
        }

        // Find the maximum sum using left, middle, and right subarrays
        int maxSum = 0;
        for (int middle = k; middle < sum.length - k; middle++) {
            int l = left[middle - k];
            int r = right[middle + k];
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
