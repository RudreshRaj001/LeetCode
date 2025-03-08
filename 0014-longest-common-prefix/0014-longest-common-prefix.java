class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder str = new StringBuilder();
        int s = Integer.MAX_VALUE;
        for(int i = 0; i < strs.length; i++){
            int len = strs[i].length();
            s = Math.min(s, len);
        }
        for(int i = 0; i < s; i++){
            char ch = strs[0].charAt(i);
            boolean flag = true;
            for(int j = 1; j < strs.length; j++){
                char tr = strs[j].charAt(i);
                if(ch != tr){
                  flag = false; 
                  break;
                } 
            }
            if(flag){
                str.append(ch);
            }else{
                break;
            }
        }
        return str.toString();
    }
}