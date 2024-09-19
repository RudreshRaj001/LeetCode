class Solution {
    public boolean isSubsequence(String s, String t) {
        int lenS = s.length();
        if(lenS == 0) return true;
        int lenT = t.length();
        int j = 0;

        for (int i = 0; i < lenT; i++) {
            if(t.charAt(i) == s.charAt(j)){
                j++;
            }
            if(j == lenS){
                return true;
            }
        }
        return false;
    }
}