class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int cnt = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    int A = Math.abs(arr[i] - arr[j]);
                    int B = Math.abs(arr[j] - arr[k]);
                    int C = Math.abs(arr[i] - arr[k]);
                    if (A <= a && B <= b && C <= c) {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}