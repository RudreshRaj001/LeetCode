class Solution {
    public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);
        // int left = 0;
        // int right = 0;
        // int ans = right - left + 1;
        // while(right < nums.length){
        //     if(nums[right] <= nums[left] + (2*k)){
        //         right = binarySearch(nums, nums[left] + (2*k), false);
        //     }else{
        //         left++;
        //     }
        //     ans = Math.max(right - left, ans);
        // }
        int ans = 0;
        int right = 0;
        for(int left = 0; left < nums.length; left++){
            right = binarySearch(nums, nums[left] + (2 * k), left);
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
    private int binarySearch(int[] nums, int target,int start){
        // flag -> true -> returns floor
        // flag -> false -> returns ceil
        int l = start;
        int r = nums.length - 1;
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(nums[mid] <= target){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return r;
    }
}