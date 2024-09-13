public class Solution {
    
    public int reverseBits(int num) {

        // Hint: int is 32 bit (Using Divide and Conquer)
        
        num = ((num & 0xffff0000) >>> 16) | ((num & 0x0000ffff) << 16);
        num = ((num & 0xff00ff00) >>> 8) | ((num & 0x00ff00ff) << 8);
        num = ((num & 0xf0f0f0f0) >>> 4) | ((num & 0x0f0f0f0f) << 4);
        num = ((num & 0xcccccccc) >>> 2) | ((num & 0x33333333) << 2);
        num = ((num & 0xaaaaaaaa) >>> 1) | ((num & 0x55555555) << 1);


        /* HexaDecimal Number Maska
           0xffff0000 -> 1111 1111 1111 1111 0000 0000 0000 0000
           0x0000ffff -> 0000 0000 0000 0000 1111 1111 1111 1111
           0xff00ff00 -> 1111 1111 0000 0000 1111 1111 0000 0000
           0x00ff00ff -> 0000 0000 1111 1111 0000 0000 1111 1111
           0xf0f0f0f0 -> 1111 0000 1111 0000 1111 0000 1111 0000
           0x0f0f0f0f -> 0000 1111 0000 1111 0000 1111 0000 1111
           0xcccccccc -> 1100 1100 1100 1100 1100 1100 1100 1100
           0x33333333 -> 0011 0011 0011 0011 0011 0011 0011 0011
           0xaaaaaaaa -> 1010 1010 1010 1010 1010 1010 1010 1010
           0x55555555 -> 0101 0101 0101 0101 0101 0101 0101 0101
         */
        
        return num;
        
    }
}