class Solution {
    public int findDuplicate(int[] nums) {
    int ptr1 = 0;
    int ptr2 = 0;
    while(true){
        ptr1 = nums[ptr1];
        ptr2 = nums[nums[ptr2]];

        if(ptr1 == ptr2){
            break;
        }
    }
    int ptr = 0;
    while(ptr != ptr1){
        ptr = nums[ptr];
        ptr1 = nums[ptr1];
    }
    return ptr1;
  }
}