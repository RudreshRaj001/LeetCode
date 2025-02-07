class Solution {
    public int countBalls(int l, int h) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = l; i <= h; i++){
            int sum = 0;
            int num = i;
            while(num > 0){
                sum += num % 10;
                num /= 10;
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        int ans = 0;
        for(int key: map.keySet()){
            int val = map.get(key);
            ans = Math.max(ans, val);
        }
        return ans;
    }
}