class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        // values[i] + i + values[j] - j
        int n = values.length; 
        int maxi = values[0];
        int maxj = Integer.MIN_VALUE;
        int ans = Integer.MIN_VALUE;


        for(int i = 1; i < n; i++){
            maxj = values[i] - i;

            if(ans < maxi + maxj) ans = maxi + maxj;

            if(values[i] + i > maxi) maxi = values[i] + i;  
        }
        return ans;
    }
}