class Solution {
    public String shortestPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        // for (int r = s.length() - 1; r >= 0; r--) {
        //     if (is_pali(s, 0, r)) {
        //         String suffix = s.substring(r + 1);
        //         return new StringBuilder(suffix).reverse().toString() + s;
        //     }
        // }

        // return "";
        long prefix = 0;
        long suffix = 0;
        int base = 29;
        int last_index = 0; // 1
        long power = 1;
        long mod = (long)Math.pow(10, 9);

        for(int i = 0; i < s.length(); i++){
            int temp = (s.charAt(i) - 'a' + 1);
            prefix = (prefix * base) % mod;
            prefix = (prefix + temp) % mod;
            suffix = (suffix + temp * power) % mod;
            power = (power * base) % mod;

            if(prefix == suffix){
                last_index = i;
            }
        }
        String suf = s.substring(last_index + 1);
        return new StringBuilder(suf).reverse().toString() + s;

    }
    // boolean is_pali(String s, int l, int r){
    //      while (l <= r) {
    //             if (s.charAt(l) != s.charAt(r)) {
    //                 return false;
    //             }
    //             l++;
    //             r--;
    //         }
    //         return true;
    // }
}