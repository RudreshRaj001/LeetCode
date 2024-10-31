class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split("\\s+");
        int n = words.length;
        int p = pattern.length();
        if(p != n) return false;
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        for(int i = 0; i < n; i++){
            char tempS = pattern.charAt(i);
            if(map.containsKey(tempS)){
                if(!map.get(tempS).equals(words[i])){
                    return false;
                }
            }else{
                if(set.contains(words[i])){
                    return false;
                }
                set.add(words[i]);
                map.put(tempS, words[i]);
            }
        }
        return true;
    }
}