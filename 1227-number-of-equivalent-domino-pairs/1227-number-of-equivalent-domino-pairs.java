class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] map = new int[100];
        int ans = 0;
        for(int i = 0; i < dominoes.length; i++){
            int tens = dominoes[i][0] < dominoes[i][1] ? dominoes[i][0] : dominoes[i][1];
            int ones = dominoes[i][0] >= dominoes[i][1] ? dominoes[i][0] : dominoes[i][1];
            int key = tens * 10 + ones;
            if(map[key] != 0){
                ans += map[key];
            }
            map[key]++;
        }

        return ans;
    }
}