// Last updated: 8/14/2026, 1:59:19 PM
1class Solution {
2    public int findTargetSumWays(int[] nums, int target) {
3        return helper(nums, target, 0, 0);
4    }
5    private int helper(int[] arr, int target, int idx, int sum) {
6        if (idx >= arr.length)
7            return sum == target ? 1 : 0;
8        int subtract = helper(arr, target, idx + 1, sum - arr[idx]);
9        int add = helper(arr, target, idx + 1, sum + arr[idx]);
10        return subtract + add;
11    }
12}