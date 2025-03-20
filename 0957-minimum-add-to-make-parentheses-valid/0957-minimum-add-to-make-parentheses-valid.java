class Solution {
    public int minAddToMakeValid(String s) {
        int ans = 0;
        int atleast = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                ans++;
            }else{
                if(ans > atleast){
                    ans--;
                }else{
                    atleast++;
                    ans++;
                }
            }
        }
        return Math.abs(ans);
    }
}