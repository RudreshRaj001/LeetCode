class Solution {
    public List<Integer> partitionLabels(String s) {
        // idea: each character which appears in partition, 
        // there last occurence should appear in that partition only
        List<Integer> ans = new ArrayList<>();
        int st = 0;
        int e = 0;


        int[] arr = new int[26];
        for(int i = 0; i < s.length(); i++){
            arr[s.charAt(i) - 'a'] = i;
        }

        int i = 0;
        while(i < s.length()){
            char ch = s.charAt(i);
            e = Math.max(e, arr[s.charAt(i) - 'a']);

            if(i == e){
                ans.add(e - st + 1);
                st = e + 1;
            }

            i++;
        }

        return ans;
    }
}