class Solution {
    public int minPartitions(String n) {
        int max = Integer.MIN_VALUE;
        char charArray[] = n.toCharArray();
        for(int i = 0; i<charArray.length; i++){
            if(max < charArray[i] - '0'){
                max = charArray[i] - '0';
            }
        }
        return max;
    }
}