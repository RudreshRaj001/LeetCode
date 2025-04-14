class Solution {
    int mod = (int) 1e9 + 7;

    public int countGoodNumbers(long n) {
        long first = (n % 2 == 0 ? (n / 2) : (n / 2) + 1);
        long second = n / 2;
        long mul1 = power(5, first) % mod;
        long mul2 = power(4, second) % mod;

        mul1 = (second != 0) ? (mul1 * mul2) % mod : mul1;
        return (int) (mul1 % mod);
    }

    public long power(long x, long y) {
        long temp;
        if (y == 0) return 1;

        temp = power(x, y / 2);

        if (y % 2 == 0) return (temp * temp) % mod; 
        else return (x * temp * temp) % mod;
    }
}