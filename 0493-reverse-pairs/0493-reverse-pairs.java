class Solution {
    public int reversePairs(int[] nums) {
        int[] dp = new int[1];
        dp[0] = 0;
        mergeSort(nums, dp);
        return dp[0];
    }

    private int[] mergeSort(int[] arr, int[] dp) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid), dp);
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length), dp);

        dp[0] += count(left, right);

        return merge(left, right);
    }

    private int count(int[] first, int[] second) {
        int i = 0;
        int j = 0;
        int cnt = 0;
        
        while(i < first.length ){
            while(j < second.length && first[i] > (2L *second[j])){
                j++;
            }
            cnt += j;
            i++;
        }
        return cnt;
    }

    private int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }

}