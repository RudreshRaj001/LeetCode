class Solution {
    public boolean isAnagram(String s, String t) {
        int lenS = s.length();
        int lenT = t.length();
        if(lenS != lenT) return false;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < lenS; i++){
            char temp = s.charAt(i);
            if(map.containsKey(temp)){
                map.put(temp, map.get(temp) + 1);
            } else {
                map.put(temp, 1);
            }
        }

        for(int i = 0; i < lenT; i++){
            char temp = t.charAt(i);
            if(map.containsKey(temp)){
                if(map.get(temp) == 0) return false;
                map.put(temp, map.get(temp) - 1);
            } else {
                return false;
            }
        }

        for (Integer value : map.values()) {
            if(value != 0){
                return false;
            }
        }
        
        return true;
    }
}