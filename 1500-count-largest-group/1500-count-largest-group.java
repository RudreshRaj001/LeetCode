class Solution {
    public int countLargestGroup(int n) {
        int[] sums = new int[1000];
        int[] arr = new int[1000];
        int ans = 0;
        for(int i = 1; i <= n; i++){
            int s = sumofdigits(i, sums, arr);
            ans = Math.max(ans, s);
        }
        return arr[ans];
    }
    private int sumofdigits(int num, int[] sums, int[] arr){
        int sum = 0;
        // int digits = 0;
        while(num > 0){
            sum += num % 10;
            // digits++;
            num /= 10;
        }
        sums[sum]++;
        arr[sums[sum]]++;
        return sums[sum];
    }
}