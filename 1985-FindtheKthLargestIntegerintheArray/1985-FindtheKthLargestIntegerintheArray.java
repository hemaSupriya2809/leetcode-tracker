// Last updated: 8/3/2026, 3:23:25 PM
1import java.util.Arrays;
2
3class Solution {
4    public String kthLargestNumber(String[] nums, int k) {
5
6        Arrays.sort(nums, (a, b) -> {
7            if (a.length() != b.length()) {
8                return a.length() - b.length();
9            }
10            return a.compareTo(b);
11        });
12
13        return nums[nums.length - k];
14    }
15}