class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0; // checking for 0 & 1

        boolean[] composites = new boolean[n];

        int limit = (int)Math.sqrt(n);
        
        // Array of composites -> true represents composite false represents prime
        // this is Sieve of Eratosthenes. 
        for (int i = 2; i <= limit; i++) {
            if (!composites[i]) {
                for (int j = i * i; j < n; j += i) {
                    composites[j] = true;
                }
            }
        }
        
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!composites[i]) count++;
        }
        
        return count;
    }
}
