class Solution {
    public int[] shuffle(int[] nums, int n) {
      int[] array = new int[nums.length];
      for(int i = 0; i < nums.length; i++){
          if(i%2 == 0){
              array[i] = nums[i/2];
          }else{
              array[i] = nums[n];
              n++; 
          }
      }
      return array;
    }
}