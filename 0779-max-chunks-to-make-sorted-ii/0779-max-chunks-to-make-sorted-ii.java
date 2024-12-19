class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        int ans = 1;
        int mx = 0;
        int mn = Integer.MAX_VALUE;
        int[] max = new int[n];
        int[] min = new int[n];
        for(int i = 0; i < n; i++){
            if(mx < arr[i]){
                mx = arr[i];
            }
            max[i] = mx;
        }
        for(int i = n - 1; i >= 0; i--){
            if(mn > arr[i]){
                mn = arr[i];
            }
            min[i] = mn;
        }
        for(int i = 0; i < n - 1; i++){
            if(max[i] <= min[i + 1]) ans++;
        }
        // [2,1,3,4,4]
        // [2,2,3,4,4]
        // [1,1,3,4,4]

        // [5,4,3,2,1]
        // [5,5,5,5,5]
        // [1,1,1,1,1]
        return ans;
    }
}