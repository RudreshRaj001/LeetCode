class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String word : strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String newWord = new String(chars); 
            // newWord acts as a common key for all the anagrams

            if(!map.containsKey(newWord)){
                map.put(newWord, new ArrayList<>());
            }

            map.get(newWord).add(word); 
        }
        return new ArrayList<>(map.values());
    }
}