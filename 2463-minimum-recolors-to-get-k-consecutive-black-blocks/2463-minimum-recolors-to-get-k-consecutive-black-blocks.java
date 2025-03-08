class Solution {
    public int minimumRecolors(String blocks, int k) {
        int res = 0;
        for(int i = 0; i < k; i++){
            if(blocks.charAt(i) == 'W') res++;
        }
        int ans = res;
        int i = 0;
        int j = k;
        while(j < blocks.length()){
            if(blocks.charAt(i) == 'W') res--;
            if(blocks.charAt(j) == 'W') res++;
            ans = Math.min(ans, res);
            j++;
            i++;
        }
        return ans;
    }
}