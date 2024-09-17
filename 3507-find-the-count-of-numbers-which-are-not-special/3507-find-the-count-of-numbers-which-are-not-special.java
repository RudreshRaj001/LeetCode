class Solution {
   public static int nonSpecialCount(int l, int r) {
        // We need to avoid all the numbers which are Square of a prime numbers 
        // in range of l to r inclusive 
        // -> those are special numbers
        List<Integer> primes = sieve((int) Math.sqrt(r)); 
        // contains all special from 0 to Math.sqrt(r)
        // we pass Math.sqrt(r) -> because those are all the prime no.s that matters
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
        // Sieve of Eratosthenes
        boolean[] isPrime = new boolean[n + 1]; // all false

        for (int i = 2; i * i <= n; i++) {
            if (!isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = true; // true means non prime
                }
            }
        }

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (!isPrime[i]) {
                primes.add(i); // adding primes 
            }
        }

        return primes; // list of all prime no.s 
    }
}