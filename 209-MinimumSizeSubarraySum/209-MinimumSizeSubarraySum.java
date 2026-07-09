// Last updated: 7/9/2026, 9:18:50 AM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;

        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        int minLen = Integer.MAX_VALUE;

        for (int i = 0; i <= n; i++) {
            long needed = prefix[i] + target;

            int bound = lowerBound(prefix, needed);

            if (bound != -1) {
                minLen = Math.min(minLen, bound - i);
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

    private int lowerBound(long[] arr, long target) {
        int left = 0, right = arr.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] >= target) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }
}