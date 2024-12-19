class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        int ans = 0;
        int i = 0;
        int max = arr[0];
        while(i < n){
            if(max < arr[i]){
                max = arr[i];
            }
            if(max == i) ans++;
            i++;
        }
        return ans;
    }
}