class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int i = 0, j = 0;
        int n1 = str1.length();
        int n2 = str2.length();
        
        while(i < n1 && j < n2){
            int str01 = (int) str1.charAt(i);
            int str02 = (int) str2.charAt(j);
            if(str01 == str02 || str01 + 1 == str02){
                j++;
            }
            else if((str01 + 1) == 123 && str02 == 97){
                j++;
            }
            i++;
        }
        return j == n2;
    }
}