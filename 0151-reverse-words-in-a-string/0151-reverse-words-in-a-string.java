class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int p = s.length() - 1;

        while(p >= 0){
            while(p >= 0 && s.charAt(p) == ' ') p--;
            if(p < 0) break;

            int end = p;

            while(p >= 0 && s.charAt(p) != ' ') p--;
            int start = p + 1;

            ans.append(s.substring(start, end+1)); // end + 1 because end is exclusive
            ans.append(" ");
        }

        return ans.toString().strip();
    }
}