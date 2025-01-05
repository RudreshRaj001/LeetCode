class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] shf = new int[n + 1]; 

        for (int[] shift : shifts) {
            int start = shift[0];
            int end = shift[1];
            int direction = shift[2];

            if (direction == 1) { 
                shf[start] += 1;
                shf[end + 1] -= 1;
            } else { 
                shf[start] -= 1;
                shf[end + 1] += 1;
            }
        }


        int diff = 0;
        for (int i = 0; i < n; i++) {
            diff += shf[i];
            shf[i] = diff; 
        }


        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int currentChar = s.charAt(i) - 'a'; 
            int shiftedChar = (currentChar + shf[i]) % 26;
            if (shiftedChar < 0) { 
                shiftedChar += 26;
            }
            result.append((char) ('a' + shiftedChar));
        }

        return result.toString();
    }
}

