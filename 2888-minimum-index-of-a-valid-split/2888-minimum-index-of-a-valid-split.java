class Solution {
    public int minimumIndex(List<Integer> nums) {
        int cnt = 1;
        int n = -1;
        for (int num : nums) {
            if (n != num) {
                cnt--;
                if (cnt == 0) {
                    n = num;
                    cnt = 1;
                }
            } else {
                cnt++;
            }
        }

        cnt = 0;
        for (int num : nums) {
            if (n == num) {
                cnt++;
            }
        }

        int count = 0;
        int len = nums.size();

        for (int i = 0; i < len; i++) {
            if (nums.get(i) == n) {
                count++;
            }
            if (count > (i + 1) / 2 && (cnt - count) * 2 > (len - i - 1)) {
                return i;
            }
        }

        return -1;
    }
}