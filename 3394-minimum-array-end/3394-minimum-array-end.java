class Solution {
    public long minEnd(int n, int x) {
        // long res = x;

        // int i_x = 1;
        // int i_n = 1;
        // // x = 101001010101
        // // n - 1 = 010010101011
        // while(i_n < n){
        //     if((i_x & x) == 0){
        //         if((i_n & (n - 1)) == 1){
        //             res = res | i_x;
        //         }
        //         i_n = i_n << 1;
        //     }
        //     i_x = i_x << 1;
        // }

        
        // return res;

        long res = x;

        long i_x = 1;
        long i_n = n - 1;
        // x = 101001010101
        // n - 1 = 010010101011
        while(i_n != 0){
            if((i_x & x) == 0){
                res = res | (i_n & 1)*i_x;
                i_n = i_n >> 1;
            }
            i_x = i_x << 1;
        }

        
        return res;
    }
}