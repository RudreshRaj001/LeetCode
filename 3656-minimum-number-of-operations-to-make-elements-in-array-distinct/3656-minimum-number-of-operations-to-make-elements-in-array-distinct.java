class Solution {
    public int minimumOperations(int[] nums) {
        int j = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                j = Math.max(j, map.get(nums[i]) + 1); 
            }
            map.put(nums[i], i);
        }

        return (int)Math.ceil(j / 3.0);
    }
}