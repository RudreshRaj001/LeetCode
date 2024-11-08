class Solution {
    public int findMinFibonacciNumbers(int k) {
        int a = 1;
        int b = 1;
        while(b <= k){
            int temp = a + b;
            a = b;
            b = temp;
        }
        int count = 0;
        while(k > 0){
            if(a<=k){
                k = k - a;
                count++;
            }

            int temp = b - a;
            b = a;
            a = temp;
        }
        return count;
    }
}