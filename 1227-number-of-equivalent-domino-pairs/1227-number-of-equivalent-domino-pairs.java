class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for(int i = 0; i < dominoes.length; i++){
            int tens = dominoes[i][0] < dominoes[i][1] ? dominoes[i][0] : dominoes[i][1];
            int ones = dominoes[i][0] >= dominoes[i][1] ? dominoes[i][0] : dominoes[i][1];
            int key = tens * 10 + ones;
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        Set<Integer> keys = map.keySet();
        for(Integer key : keys){
            Integer value = map.get(key);
            if ( value == 1) continue;
            int pairs = getPairs(map.get(key));
            ans += pairs;
        }

        return ans;
    }
    private int getPairs(int val){
        int ans = 0;
        while(val > 1){
            ans += val - 1;
            val--;
        }
        return ans;
    }
}