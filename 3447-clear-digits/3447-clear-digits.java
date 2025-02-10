class Solution {
    public String clearDigits(String s) {
        int n =  s.length();
        for(int i = 0; i < n; i++){
            // if()
            char ch = s.charAt(i);
            if (!Character.isLetter(ch)) {
                String r;
                if(i-1 >= 0){
                    r = s.substring(i-1, i+1);
                    // n -= 2;
                    i -= 2;
                }else{
                    r = s.substring(0, i+1);
                    // n -= 1;
                    i -= 1;
                }
                String result = s.replace(r, "");
                s = result;
                n = s.length();
            }
        }
        return s;
    }
}