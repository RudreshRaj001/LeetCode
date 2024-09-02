class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int num = 0;
        int pos = 1000;
        int modulo = 10000;

        while(modulo >= 10){
            int p1 = (num1 % modulo) / pos;
            int p2 = (num2 % modulo) / pos;
            int p3 = (num3 % modulo) / pos;
            int k = Math.min(Math.min(p1, p2), p3);

            num = num * 10 + k;
            pos = pos / 10;
            modulo = modulo / 10;
        }
        return num;
    }
}