class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n = shifts.length;
        long[] shfSum = new long[n];
        shfSum[n - 1] = shifts[n - 1]; 
        for(int i = n - 2; i >= 0; i--){
            shfSum[i] = shifts[i] + shfSum[i + 1];
        }
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < n; i++){
            str.append((char)((((s.charAt(i) - 'a') + shfSum[i])%26) + 'a'));
        }
        return str.toString();
    }
}