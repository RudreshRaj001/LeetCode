class Solution {
    public int maxScore(String s) {
        int ones = 0;
        int zeros = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1') ones++; 
        }
        int max = 0;
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) == '0') zeros++; 
            if(s.charAt(i) == '1') ones--;
            max = Math.max(max, zeros + ones);
        }
        return max;
    }
}