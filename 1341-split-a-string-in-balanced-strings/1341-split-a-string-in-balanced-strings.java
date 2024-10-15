class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int ans = 0;
        int l = s.length();
        for(int i = 0; i < l; i++){
            if(s.charAt(i) == 'R'){
                count++;
            }else{
                count--;
            }
            if(count == 0){
                ans++;
            }
        }

        return ans;
    }
}