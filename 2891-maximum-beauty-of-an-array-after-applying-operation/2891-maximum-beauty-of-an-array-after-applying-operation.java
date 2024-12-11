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
    private int binarySearch(int[] nums, int target, boolean flag){
        // flag -> true -> returns floor
        // flag -> false -> returns ceil
        int l = 0;
        int r = nums.length - 1;
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return flag ? r : l;
    }
}