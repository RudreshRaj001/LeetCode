class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        int lenRansom = ransomNote.length();
        int lenMag = magazine.length();
        for(int i = 0; i < lenMag; i++){
            char temp = magazine.charAt(i);
            if(map.containsKey(temp)){
                map.put(temp, map.get(temp) + 1);
            } else {
                map.put(temp, 1);
            }
        }

        for(int i = 0; i < lenRansom; i++){
            char temp = ransomNote.charAt(i);
            if(map.containsKey(temp)){
                if(map.get(temp) == 0) return false;
                map.put(temp, map.get(temp) - 1);
            } else {
                return false;
            }
        }

        return true;
    }
}