class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> countMap = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char temp = s.charAt(i);
            if(countMap.containsKey(temp)){
                int count = countMap.get(temp) + 1;
                countMap.put(temp, count);
            }else{
                countMap.put(temp, 1);
            }
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (countMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        
        return -1; 
    }
}