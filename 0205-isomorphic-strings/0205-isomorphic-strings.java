class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        int n = s.length();
        for(int i = 0; i < n; i++){
            char tempS = s.charAt(i);
            char tempT = t.charAt(i);
            if(map.containsKey(tempS)){
                if(map.get(tempS) != tempT){
                    return false;
                }
            }else{
                if(set.contains(tempT)){
                    return false;
                }
                set.add(tempT);
                map.put(tempS, tempT);
            }
        }
        return true;
    }
}