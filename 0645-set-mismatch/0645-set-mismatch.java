class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        int i = 1;
        int legalsum = 0;
        int dupli = -1;
        for(int n : nums){
            legalsum += i;
            i++;
            if(set.contains(n)){
                dupli = n;
            }else{
                set.add(n);
                sum += n;
            }
        }
        int missing = legalsum - sum;
        return new int[]{dupli, missing};
    }
}