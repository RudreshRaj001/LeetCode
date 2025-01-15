class Solution {
    public int minimizeXor(int num1, int num2) {
        int bitcnt1 = Integer.bitCount(num1);
        int bitcnt2 = Integer.bitCount(num2);
        int ans = num1;
        if (bitcnt1 < bitcnt2) {
            int cnt = bitcnt2 - bitcnt1; // we need to set cnt bits from right
            for (int i = 0; i < 32; i++) { 
                int bit = (num1 >> i) & 1; // Extract the i-th bit
                if(cnt > 0 && bit == 0){
                    ans |= (1 << i); // sets bit
                    cnt--;
                }
            }
        } else if(bitcnt1 > bitcnt2){
            int cnt = bitcnt1 - bitcnt2; // we need to unset cnt bits from right
            for (int i = 0; i < 32; i++) { 
                int bit = (num1 >> i) & 1; // Extract the i-th bit
                if(cnt > 0 && bit == 1){
                    ans &= ~(1 << i); // unsets bit
                    cnt--;
                }
            }
        }
        return ans;
    }
}