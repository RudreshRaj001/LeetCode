class Solution {
    public int majorityElement(int[] nums) {
        // Moore's voting algorithm :-
        // as the majority element appeared more than [n/2] times 
        // means its count will cancel out all the rest of the elements counts combined.
        int n = nums.length;
        int count = 0;
        int candidate = 0;
        for(int i = 0; i < n; i++){
            if(count == 0) candidate = nums[i];
            if(candidate == nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }
}