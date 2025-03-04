class Solution {
    public boolean checkPowersOfThree(int n) {
        return helper(n, 0);
    }
    private boolean helper(int n, int pow){
        if(n == 0){
            return true;
        }
        if(n < 0){
            return false;
        }
        int power = (int)Math.pow(3, pow);

        if (power > n) {
            return false; 
        }

        boolean pick = helper(n - power, pow + 1);
        boolean nopick = helper(n , pow + 1);
        return pick || nopick;
    }
}