class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int rev=0;
        int original=x;

        while(x > 0)   
        {  
            int lastdigit = x % 10;  
            rev = rev * 10 + lastdigit;  
            x = x/10;  
        }  
        if(rev==original){
            return true;
        }
        else{
            return false;
        }

    }
        

}