class Solution {
    public int minBitFlips(int start, int goal) {
        int count = 0;
        int xor = start ^ goal; // gives 1 where bits are different
        while(xor != 0){
            count += xor & 1; //If last bit is 1, add that to count
            xor = xor >> 1; // right shift
        }
        return count;
    }
}