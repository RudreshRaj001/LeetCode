class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(!set.contains(n)){
            set.add(n);
            int temp = 0;
            while(n != 0){
                int tempDigit = n%10;
                temp += (tempDigit * tempDigit);
                n /= 10;
            }
            n = temp;
            if(n == 1){
                return true;
            }
        }
        return false;
    }
}