class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0;
        int res = 0;
        int n = nums.length;
        int count0 = 0;
        int i = 0;

        while (i < n) {
            if (nums[i] == 0) {
                count0++;
            }

            if (count0 <= k) {
                res = Math.max(res, i - l + 1);
            } else {
                while (count0 > k) {
                    if (nums[l] == 0) {
                        count0--;
                    }
                    l++;
                }
            }

            i++;
        }

        return res;
    }
}
