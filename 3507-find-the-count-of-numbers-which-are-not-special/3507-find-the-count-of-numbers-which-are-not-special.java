class Solution {
   public static int nonSpecialCount(int l, int r) {
        List<Integer> primes = sieve((int) Math.sqrt(r));
        int specialCount = 0;

        for (int prime : primes) {
            long specialNumber = (long) prime * prime;
            if (specialNumber >= l && specialNumber <= r) {
                specialCount++;
            }
        }

        return (r - l + 1) - specialCount;
    }

    private static List<Integer> sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        // for (int i = 2; i <= n; i++) {
        //     isPrime[i] = true;
        // }

        for (int i = 2; i * i <= n; i++) {
            if (!isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = true;
                }
            }
        }

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (!isPrime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }
}