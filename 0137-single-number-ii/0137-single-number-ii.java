class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                cnt += (nums[j] >> i) & 1;
            }
            if(cnt % 3 == 1) ans = ans | (1<<i); // sets the ith bit
        }
        return ans;
    }
}