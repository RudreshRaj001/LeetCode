class Solution {
    public int reverse(int x) {
        boolean sign = false;
        if(x < 0){
            sign = true;
            x = -x;
        }

        int num = 0;
        while(x > 0){
            int n = x % 10;
            int newnum = num*10 + n;
            if((newnum - n) / 10 != num) return 0;
            num = newnum;
            x /= 10;
        }
        if(sign) num = -num;
        return num;
    }
}