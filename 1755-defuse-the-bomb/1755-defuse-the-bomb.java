class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] res = new int[n];
        if(k == 0) return res;
        for(int i = 0; i < n; i++){
            int sum = 0;
            if(k > 0){
                for(int j = i + 1; j <= i + k; j++){
                    sum += code[j%n];
                }
            }else{
                for(int j = i - 1; j > i - 1 - Math.abs(k); j--){
                    sum += code[(j + n) % n];
                }
            }
            res[i] = sum;
        }
        return res;
    }
}