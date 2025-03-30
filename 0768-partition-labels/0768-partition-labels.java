class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> ans = new ArrayList<>();
        int end = 0;
        int start = 0;
        int i = 0;
        while(i < s.length()){
            char ch = s.charAt(i);
            end = Math.max(end, (s.lastIndexOf(ch, s.length() - 1)));
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