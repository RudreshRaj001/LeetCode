class Solution {
    public int singleNonDuplicate(int[] nums) {
        int len = nums.length;
        int start = 0;
        int end = len - 1;
        while(start < end){
            int mid = start + (end - start)/2;

            // Ensure mid is even
            if(mid % 2 == 1){
                mid--;
            } 

            // Compare mid with its pair
            if (nums[mid] == nums[mid + 1]) {
                // If equal, single element is after mid
                // because there are exactly even elements before mid 
                // and there is no chance that exactly one of them doesnt have a pair
                start = mid + 2;
            } else {
                // If not equal, single element is before or at mid
                end = mid;
            }
        }

        // 'start' should now point to the single element
        return nums[start];
    }
}