class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        int ans = 1;
        int max = 0;
        int mn = Integer.MAX_VALUE;
        int[] min = new int[n];
        for(int i = n - 1; i >= 0; i--){
            if(mn > arr[i]){
                mn = arr[i];
            }
            min[i] = mn;
        }

        for(int i = 0; i < n - 1; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            if(max <= min[i + 1]) ans++;
        }
        return ans;
    }
}