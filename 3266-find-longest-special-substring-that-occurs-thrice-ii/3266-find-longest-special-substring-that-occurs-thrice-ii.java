class Solution {
    public int maximumLength(String s) {
        int [][]arr = new int[26][3];
        char ls = '*';
        int cunt = 0;
        for (int i = 0; i < arr.length; i++) {
            Arrays.fill(arr[i], -1);
        }

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch==ls){
                cunt++;
            }
            else{
                cunt=1;
                ls=ch;
            }
            int minIdx = 0;
            for(int j=1;j<3;j++){
                if(arr[ch-'a'][j]<arr[ch-'a'][minIdx]){
                    minIdx=j;
                }
            }
            if(arr[ch-'a'][minIdx]<cunt){
                arr[ch-'a'][minIdx]=cunt;
            }
        }
        int max = -1;
        for(int[] ar: arr){
            int min = ar[0];
            for(int ele:ar){
                min = Math.min(min,ele);
            }
            max = Math.max(min,max);
        }
        return max;
    }
}