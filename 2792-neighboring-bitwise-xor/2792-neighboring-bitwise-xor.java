class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        boolean first = true;
        boolean last = true;
        for(int i = 0; i < derived.length; i++){
            if(derived[i] == 1){
                last = !last;
            }
        }
        return first == last;
    }
}