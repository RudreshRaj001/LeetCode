class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> ans = new ArrayList<>();
        int end = 0;
        int start = 0;
        int[] li = new int[26];
        for(int i = 0; i<s.length();i++){
            li[s.charAt(i) - 'a'] = i;
        }
        int i = 0;
        while(i < s.length()){
            char ch = s.charAt(i);
            end = Math.max(end, li[ch - 'a']);
            if(i == end){
                ans.add(end - start + 1);
                start = i + 1;
            }
            i++;
        }

        if(start < s.length()){
            ans.add(s.length() - start);
        }

        return ans;
    }
}