class Solution {
    public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = 0;
        int ans = right - left + 1;
        while(right < nums.length){
            if(nums[right] <= nums[left] + (2*k)){
                right++;
            }else{
                left++;
            }
            ans = Math.max(right - left, ans);
        }
        return ans;
    }
}