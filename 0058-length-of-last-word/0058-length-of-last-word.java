class Solution {
    public int lengthOfLastWord(String s) {
        int ans = 0;
        int i = s.length() - 1;

        // avoid empty spaces in the end
        while(i>=0 && s.charAt(i)==' '){
            i--;
        }

        // length of the last word
        while(i>=0 && s.charAt(i)!=' '){
            ans++;
            i--;
        }
        
        return ans;
    }
}