class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        // int count = 0;
        // for(int i = 0; i < items.size(); i++){
        //     if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)) count++;
        //     if(ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)) count++;
        //     if(ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)) count++;
        // }
        // return count;

        int index = 0;
        if(ruleKey.equals("color")) index = 1;
        else if(ruleKey.equals("name")) index = 2;
        int ans=0;
        for(int i = 0; i < items.size(); i++){
            if(items.get(i).get(index).equals(ruleValue)) ans++;
        }
        return ans;
    }
}