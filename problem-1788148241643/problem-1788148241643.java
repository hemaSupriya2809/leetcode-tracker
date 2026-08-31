// Last updated: 8/31/2026, 9:20:41 AM
1class Solution {
2    public int[] singleNumber(int[] nums) {
3        int n = nums.length;
4        int[] result = new int[2];
5        int index = 0;
6        for (int i = 0; i < n; i++) {
7            boolean found = false;
8            for (int j = 0; j < n; j++) {
9                if (i != j && nums[i] == nums[j]) {
10                    found = true;
11                    break;
12                }
13            }
14            if (!found) {
15                result[index++] = nums[i];
16                if (index == 2) {
17                    break;
18                }
19            }
20        }
21        return result;
22    }
23}