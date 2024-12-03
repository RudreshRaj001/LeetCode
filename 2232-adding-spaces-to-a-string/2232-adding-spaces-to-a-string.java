class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder ans = new StringBuilder();
        int len = s.length();
        int j = 0;
        for(int i = 0; i < len; i++){
            if(spaces[j] == i){
                ans.append(" ");
                ans.append(s.charAt(i));
                if(j < spaces.length - 1){
                    j++;
                }
            }else{
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}