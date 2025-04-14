class Solution {
    public int findMin(int[] nums) {
        // return arr[findPivotWithDuplicates(arr) + 1];
        int s = 0;
        int e = nums.length - 1;
        while(s < e){
            int mid = s + (e - s) / 2;
            if(nums[mid] > nums[e]){
                s = mid + 1;
            }else if (nums[mid] < nums[e]){
                e = mid;
            }else{
                e--;
            }
        }
        return nums[e];
    }

    static public int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                // mid < end because mid + 1 might give out of bound
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                // mid > start because mid - 1 might give out of bound
                return mid - 1;
            }

            // Duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                if (start < end && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted so the pivot should be in right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}