/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 * public int get(int index) {}
 * public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peakIndexInMountainArray(mountainArr);
        int ans = OABinarySearch(mountainArr, target, 0, peak);
        if (ans == -1) {
            ans = OABinarySearch(mountainArr, target, peak + 1, mountainArr.length() - 1);
        }
        return ans;
    }

    public int peakIndexInMountainArray(MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() - 1;

        while (start < end) {
            int mid = start + ((end - start) / 2);
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                start = mid + 1;
            } else{
                end = mid;
            }
        }
        return start;
    }

    public int OABinarySearch(MountainArray mountainArr, int target, int start, int end) {
        boolean isAsc = mountainArr.get(start) < mountainArr.get(end);
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            int midValue = mountainArr.get(mid);
            if (midValue == target) {
                return mid;
            }
            if (isAsc) {
                if (target < midValue) {
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            } else {
                if (target > midValue) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}