class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int l = box.length;
        int b = box[0].length;

        for(char[] row : box){
            int j = b - 1;
            for(int i =  b - 1; i >= 0; i--){
                if(row[i] == '#'){
                    char temp = row[j];
                    row[j] = row[i];
                    row[i] = temp;
                    j--;
                }else if(row[i] == '*'){
                    j = i - 1;
                }
            }
            while(j >= 0){
                row[j] = '.';
                j--;
            }
        }

        char[][] ans = new char[b][l];
        for(int i = 0; i < b; i++){
            for(int j = 0; j < l; j++){
                ans[i][l - j - 1] = box[j][i];
            }
        }
        return ans;
    }
}