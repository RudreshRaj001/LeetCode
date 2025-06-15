class Solution {
    public int maxDiff(int num) {
        int n = (int)(Math.log10(num));
        int x = num / (int)Math.pow(10, n);
        int y = x;
        boolean flag = false;
        int i = 1;
        while(x == 9){
            int div = (int)Math.pow(10, n - i);
            if(div == 0) break;
            x = (num / div) % 10;
            i++;
        }
        i = 1;
        while(y == 1 || y == 0){
            flag = true;
            int div = (int)Math.pow(10, n - i);
            if(div == 0){
                y = 1;
                flag = false;
                break;
            } 
            y = (num / div) % 10;
            i++;
        }

        int mul = 1;
        int ans = 0;
        while(num > 0){
            int dig = num % 10;
            int add_min = (dig == y) ? (flag ? 0 : 1) : dig; 
            int add_max = (dig == x) ? 9 : dig;
  
            ans = (ans + (add_max - add_min) * mul);
            num /= 10;
            mul *= 10;
        }
        return ans;
    }
}