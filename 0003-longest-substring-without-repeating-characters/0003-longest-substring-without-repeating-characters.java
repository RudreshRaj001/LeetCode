class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int len = s.length();
        if(len == 1) return 1;
        int start = 0;
        int ans = 0;
        for(int i = 0; i < len; i++){
            char temp = s.charAt(i);
            if(map.containsKey(temp)){
                start = Math.max(map.get(temp) + 1, start);
                map.put(temp, i);
            }else{
                map.put(temp, i);
            }
            int tempAns = i - start + 1;
            if(tempAns > ans){
                ans = tempAns;
            }
        }
        return ans;
    }
}