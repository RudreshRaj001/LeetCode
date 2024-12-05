class Solution {
    public boolean canTransform(String start, String target) {
        int i = 0;
        int j = 0;
        int n = start.length();
        while(i <= n && j <= n){
            while(i < n && start.charAt(i) == 'X') i++; 
            while(j < n && target.charAt(j) == 'X') j++;

            if(i == n || j == n) return i == n && j == n;

            if(start.charAt(i) == target.charAt(j)){
                if(start.charAt(i) == 'L' && i < j) return false;
                if(start.charAt(i) == 'R' && i > j) return false;
            }else{
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}