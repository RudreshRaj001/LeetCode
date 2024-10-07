class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int ind = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                ind = i;
                break;
            }
        }

        if (ind == -1) {
            rev(nums, 0, n - 1);
        } else {
            for (int i = n - 1; i >= 0; i--) {
                if (nums[i] > nums[ind]) {
                    int temp = nums[i];
                    nums[i] = nums[ind];
                    nums[ind] = temp;
                    break;
                }
            }
            rev(nums, ind + 1, n - 1);
        }

    }

    public void rev(int[] arr, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            // Swap elements at startIndex and endIndex
            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;

            startIndex++;
            endIndex--;
        }
    }
}