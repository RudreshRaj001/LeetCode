class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int cnt = 0;
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                int product = nums[i] * nums[j];
                if(map.containsKey(product)){
                    int count = map.get(product);
                    cnt+=8 * count;
                    map.put(product, count + 1);
                }else{
                    map.put(product, 1);
                }
            }
        }
        return cnt;
    }
}