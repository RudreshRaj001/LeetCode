class Solution {
    public int mySqrt(int x) {
    int start = 0;
    int end = x;
    if(x < 2){
      return x;
    }
    while (start <= end) {
      int mid = start + (end - start)/2;
      if (mid > x / mid){
        end = mid - 1;
      } else if (mid < x / mid){
        start = mid + 1;
      } else if (mid == x / mid){
        return mid;
      } 
    }
    return end;
  }
}