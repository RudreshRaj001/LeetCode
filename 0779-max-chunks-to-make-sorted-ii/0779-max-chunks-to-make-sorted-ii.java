class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        int ans = 1;
        int mx = 0;
        int mn = Integer.MAX_VALUE;
        // int[] max = new int[n];
        int[] min = new int[n];
        // for(int i = 0; i < n; i++){
        //     if(mx < arr[i]){
        //         mx = arr[i];
        //     }
        //     max[i] = mx;
        // }
        for(int i = n - 1; i >= 0; i--){
            if(mn > arr[i]){
                mn = arr[i];
            }
            min[i] = mn;
        }
        for(int i = 0; i < n - 1; i++){
            if(mx < arr[i]){
                mx = arr[i];
            }
            if(mx <= min[i + 1]) ans++;
        }
        return ans;
    }
}