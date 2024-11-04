class Solution {
    public String compressedString(String word) {
        StringBuilder ans = new StringBuilder();
        int count = 1;
        char current = word.charAt(0);
        int len = word.length();
        for(int i = 1 ; i < len; i++){
            char temp = word.charAt(i);
            if(temp == current && count < 9){
                count++;
            }else{
                ans.append(count);
                ans.append(current);
                count = 1;
                current = temp;
            }
        }
        ans.append(count);
        ans.append(current);
        return ans.toString();
    }
}