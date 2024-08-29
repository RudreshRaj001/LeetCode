class Solution {
    public int reachNumber(int target) {
        // Linear Search
        // if(target < 0) target *= -1; // OR  target = Math.abs(target);
        // int n = 1;
        // int sum = 0;

        // while (sum < target) {
        //     sum += n;
        //     n++;
        // }

        // while ((sum - target) % 2 != 0) {
        //     sum += n;
        //     n++;
        // }
        // return n - 1;

        // Binary Search
        if(target < 0) target *= -1; // OR  target = Math.abs(target);
        int pos = 1;
        long sum = 0;
        int start = 1;
        int end = target;
        int mid;
        int steps = 0;

        while (start <= end) {
            mid = start + (end - start)/2; // here mid represents no. of steps
            sum = (long)mid*(mid+1)/2;
            if(sum >= target){
                pos = (int)sum;
                steps = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }

        }

        while ((pos - target) % 2 != 0) {
            steps++;
            pos += steps;
        }
        return steps;
    }
}