class Solution {
    public int findMin(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                // mid < end because mid + 1 might give out of bound
                return arr[mid + 1];
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                // mid > start because mid - 1 might give out of bound
                return arr[mid];
            }
            if (arr[mid] <= arr[start]) {
                // As we have distinct values we need not worry about = case
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[0];
    }
}