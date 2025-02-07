class Solution {
    public int maxArea(int[] arr) {
        int l = 0;
        int r = arr.length-1;
        int max = 0;
        while(l < r){
            int product = (r - l) * Math.min(arr[r], arr[l]);
            max = Math.max(product, max);
            if(arr[l]<arr[r]){
                l++;
            }else{
                r--;
            }
        }
        return max;
    }
}