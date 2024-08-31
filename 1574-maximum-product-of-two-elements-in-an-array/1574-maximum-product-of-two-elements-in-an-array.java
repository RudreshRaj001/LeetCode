class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if((nums[i]-1)*(nums[j]-1) > ans){
                    ans = (nums[i]-1)*(nums[j]-1);
                }
            }
        }
        return ans;
    }
}