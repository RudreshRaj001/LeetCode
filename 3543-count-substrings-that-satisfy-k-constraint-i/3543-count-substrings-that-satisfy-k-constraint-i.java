class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int length = s.length();
        int count = 0;

        for(int i = 0; i < length; i++){
            int ones = 0;
            int zeros = 0;
            for(int j = i; j < length; j++){
                if(s.charAt(j) == '0'){
                    zeros++;
                }else{
                    ones++;
                }

                if(zeros <= k || ones <= k){
                    count++;
                }
            }
        }
        return count;
    }
}