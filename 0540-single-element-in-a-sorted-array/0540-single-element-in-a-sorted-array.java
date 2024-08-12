class Solution {
    public int singleNonDuplicate(int[] nums) {
        // 1 1 2 2 3 3 4 4 5 5 
        // 0 1 2 3 4 5 6 7 8 9 

        // 1 1 2 2 3 3 4 4 5  6 6 7 7
        // 0 1 2 3 4 5       

        // end = 13 -> odd
        // 8
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