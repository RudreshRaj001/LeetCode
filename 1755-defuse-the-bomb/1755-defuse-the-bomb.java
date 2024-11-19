class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] res = new int[n];
        if(k == 0) return res;

        int sum = 0;
        if(k > 0){
             for (int i = 1; i <= k; i++) {
                sum += code[i % n];
            }

            for (int i = 0; i < n; i++) {
                res[i] = sum;
                sum -= code[(i + 1) % n]; // Remove the next element going out of the window
                sum += code[(i + k + 1) % n]; // Add the next element coming into the window
            }
        }else{
            for(int i = -1; i >= k; i--){
                sum += code[(i + n)%n];
            }

            for(int i = 0; i < n; i++){
                res[i] = sum;
                sum += code[i];
                sum -= code[(i + k + n)%n];
            }
        }

        return res;
    }
}