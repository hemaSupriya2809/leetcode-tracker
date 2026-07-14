// Last updated: 7/14/2026, 12:05:10 PM
1class Solution {
2    public int rob(int[] nums) {
3
4        if (nums.length == 1)
5            return nums[0];
6
7        int[] dp = new int[nums.length];
8
9        dp[0] = nums[0];
10        dp[1] = Math.max(nums[0], nums[1]);
11
12        for (int i = 2; i < nums.length; i++) {
13            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
14        }
15
16        return dp[nums.length - 1];
17    }
18}