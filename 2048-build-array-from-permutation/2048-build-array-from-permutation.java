class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            nums[i] += n * (nums[nums[i]] % n);
            // trying to store 2 values at a single place:
            // the current value and the futur value
            // nums[nums[i]] % n -> if gives the current value
            // nums[i] /= n -> gives the future value
        }
        for (int i = 0; i < n; i++) {
            nums[i] /= n;
        }

        return nums;
    }
}