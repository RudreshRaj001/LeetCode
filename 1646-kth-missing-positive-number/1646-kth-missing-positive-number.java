class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = 1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]!=n){
                k--;
                if(k == 0){
                    return n;
                }
                i--;
            }
            n++;
        }

        return arr[arr.length - 1] + k;
    }
}