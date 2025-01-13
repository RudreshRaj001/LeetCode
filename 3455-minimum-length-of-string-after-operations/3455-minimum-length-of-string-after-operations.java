class Solution {
    public int minimumLength(String s) {
        int[] count = new int[26];
        Arrays.fill(count,0);
        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
        }
        int sum = 0;
        for(int i = 0; i < 26; i++){
            while(count[i] > 2){
                count[i] -= 2;
            }
            sum += count[i];
        }
        return sum;
    }
}