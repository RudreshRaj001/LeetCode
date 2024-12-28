class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int n = values.length; 
        int maxi = values[0];
        int maxj = Integer.MIN_VALUE;
        int ans = Integer.MIN_VALUE;
        for(int i = 1; i < n; i++){
            maxj = values[i] - i;
            ans = Math.max(ans,maxi + maxj);
            maxi = Math.max(maxi,values[i] + i);  
        }
        return ans;
    }
}