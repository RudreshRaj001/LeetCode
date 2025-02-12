class Solution {
    public int minimumOperations(int[] nums) {
        int j = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                j = Math.max(j, map.get(nums[i]) + 1); 
            }
            map.put(nums[i], i);
        }

        if(j == -1){
            return 0;
        }
        // System.out.println(j);

        Double value = j / 3.0;
        return (int)Math.ceil(value);
    }
}