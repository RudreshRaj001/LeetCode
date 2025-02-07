class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if(nums.length == 1){
            list.add(String.valueOf(nums[0]));
            return list;
        }
        int i = 0;
        int j = 1;
        while(i < nums.length && j < nums.length){
            while(j < nums.length && nums[j - 1] == (nums[j] - 1)){
                j++;
            }
            if(j - 1 == i){
                list.add(String.valueOf(nums[i]));
            }else{
                list.add(String.valueOf(nums[i]) + "->" + String.valueOf(nums[j-1]));
            }

            i = j;
            if(j == nums.length - 1){
                list.add(String.valueOf(nums[j]));
            }
            j++;
        }
        return list;
    }
}