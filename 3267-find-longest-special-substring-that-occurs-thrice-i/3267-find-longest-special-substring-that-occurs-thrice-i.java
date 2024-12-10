class Solution {
    public int maximumLength(String s) {
        int n = s.length();
        int[][] tops = new int[26][3];

        for (int i = 0; i < 26; i++) {
            Arrays.fill(tops[i], -1);
        }

        char lastSeen = '*';
        int window = 0;
        int max_len = -1;
        for(int i = 0; i < n; i++){
            char temp = s.charAt(i);
            if(temp == lastSeen){
                window++;
            }else{
                lastSeen = temp;
                window = 1;
            }

            int min = Integer.MAX_VALUE;
            int a = (int)temp - 'a';
            int b = 0;
            for(int k = 0; k < 3; k++){
                if(tops[a][k] < min){
                    min = tops[a][k];
                    b = k;
                }
            }
            tops[a][b] = Math.max(tops[a][b], window);
        }

        for(int i = 0; i < 26; i++){
            int min = Integer.MAX_VALUE;
            for(int j = 0; j < 3; j++){
                if(tops[i][j] < min){
                    min = tops[i][j];
                }
            }
            max_len = Math.max(max_len,min);
        }
        return max_len;
    }

}