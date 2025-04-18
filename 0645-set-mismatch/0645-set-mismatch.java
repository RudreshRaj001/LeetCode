class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int i = 1;
        int legalsum = 0;
        int dupli = -1;
        for(int n : nums){
            legalsum += i - n;
            i++;
            if(set.contains(n)){
                dupli = n;
            }else{
                set.add(n);
            }
        }
        int missing = legalsum + dupli;
        return new int[]{dupli, missing};
    }
}