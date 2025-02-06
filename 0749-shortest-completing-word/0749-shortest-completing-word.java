class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] lic = new int[26];
        // for(int i = 0; i < licensePlate.length(); i++){
        //     int ch = (int)licensePlate.charAt(i);
        //     if((ch >= 97 && ch <= 122)){
        //         ch -= 97;
        //         lic[ch]++;
        //     }
        //     if((ch >= 65 && ch <= 90)){
        //         ch -= 65;
        //         lic[ch]++;
        //     }
        // }
        for (char ch : licensePlate.toCharArray()) {
            if (Character.isLetter(ch)) {
                lic[Character.toLowerCase(ch) - 'a']++;
            }
        }

        String ans = null;
        for(String word: words){
            int[] alpha = Arrays.copyOf(lic, 26);
            for (char ch : word.toCharArray()) {
                alpha[ch - 'a']--;
            }
            boolean flag = true;
            for (int count : alpha) {
                if (count > 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                if (ans == null || word.length() < ans.length()) {
                    ans = word;
                }
            }
        }
        return ans;
    }
}