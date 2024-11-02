class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> countMap = new HashMap<>();
        int n = s.length();
        for(int i = 0; i < n; i++){
            char temp = s.charAt(i);
            if(countMap.containsKey(temp)){
                countMap.put(temp, countMap.get(temp) + 1);
            }else{
                countMap.put(temp, 1);
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (countMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        
        return -1; 
    }
}