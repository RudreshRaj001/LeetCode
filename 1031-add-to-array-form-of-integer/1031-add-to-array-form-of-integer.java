class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        // 999 + 1
        // 9 + 1 = 10 % 10 => 0
        // 10 / 10 = 1 
        List<Integer> list = new ArrayList<Integer>(); 
        int length = num.length;
        for(int i = length - 1; i >= 0; i--){
            list.add(0, (num[i]+k)%10);
            k = (num[i]+k)/10;
        }
        while(k>0){
            list.add(0,k%10);
            k /= 10;
        }
        return list;
    }
}