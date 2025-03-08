class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] maxL = new int[n];
        int[] maxR = new int[n];
        int max = 0;
        for(int i = 0; i < n; i++){
            maxL[i] = max;
            max = Math.max(max, height[i]);
        }
        max = 0;
        for(int i = n - 1; i >= 0; i--){
            maxR[i] = max;
            max = Math.max(max, height[i]);
        }
        int res = 0;
        for(int i = 0; i < n; i++){
            int water = Math.min(maxR[i], maxL[i]) - height[i];
            if(water < 0) water = 0;
            res+=water;
        }
        return res;
    }
}