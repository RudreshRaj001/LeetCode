class Solution {
    public List<Integer> partitionLabels(String s) {
        // idea: each character which appears in partition, 
        // there last occurence should appear in that partition only
        List<Integer> ans = new ArrayList<>();
        int st = 0;
        int e = 0;

        int i = 0;

        while(i < s.length()){
            char ch = s.charAt(i);
            e = Math.max(e, s.lastIndexOf(ch, s.length() - 1));

            if(i == e){
                ans.add(e - st + 1);
                st = e + 1;
            }

            i++;
        }
        
        return ans;
    }
}