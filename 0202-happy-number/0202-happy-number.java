class Solution {
    public boolean isHappy(int n) {
        int f = n;
        int s = n;
        do {
            s = findSquare(s);
            f = findSquare(findSquare(f));
            if(s == 1 || f == 1){
                return true;
            }

        } while(f != s);
        return false;
    }
    private int findSquare(int num){

        int ans = 0;

        while(num > 0){

            int rem = num % 10;
            ans = ans + rem * rem;
            num = num / 10;
        }

        return ans;
    }
}