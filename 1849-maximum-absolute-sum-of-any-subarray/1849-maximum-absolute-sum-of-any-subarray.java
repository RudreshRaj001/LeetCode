class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int max = 0;
        int min = 0;
        int ans = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
            int a = Math.abs(sum - min);
            int b = Math.abs(sum - max);
            ans = Math.max(ans,Math.max(a,b));

            max = Math.max(max, sum);
            min = Math.min(min, sum);

        }
        return ans;
    }
}