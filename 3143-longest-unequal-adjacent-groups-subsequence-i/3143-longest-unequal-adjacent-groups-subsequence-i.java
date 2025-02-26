class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> list = new ArrayList<>();
        int flag = groups[0];
        list.add(words[0]);
        for(int i = 1; i < groups.length; i++){
            if(flag != groups[i]){
                list.add(words[i]);
                flag = groups[i];
            }
        }
        return list;
    }
}