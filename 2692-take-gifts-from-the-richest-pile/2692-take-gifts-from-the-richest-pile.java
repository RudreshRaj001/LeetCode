class Solution {
    public long pickGifts(int[] gifts, int k) {
        while(k > 0){
            int max = 0;
            for(int i = 1; i < gifts.length; i++){
                if(gifts[max] < gifts[i]){
                    max = i;
                }
            }
            gifts[max] = (int)Math.sqrt(gifts[max]);
            k--;
        }
        long ans = 0;
        for(int i = 0; i < gifts.length; i++){
            ans += gifts[i];
        }
        return ans;
    }
}