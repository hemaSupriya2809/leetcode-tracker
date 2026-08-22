// Last updated: 8/22/2026, 11:07:29 AM
1import java.util.Arrays;
2class Solution {
3    public int threeSumClosest(int[] nums, int target) {
4        Arrays.sort(nums);
5        int closestSum = nums[0] + nums[1] + nums[2]; 
6        for (int i = 0; i < nums.length - 2; i++) {
7            int j = i + 1;
8            int k = nums.length - 1;
9            while (j < k) {
10                int sum = nums[i] + nums[j] + nums[k];
11                if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
12                    closestSum = sum; 
13                }
14                if (sum < target) {
15                    j++; 
16                } else {
17                    k--; 
18                }
19            }
20        }
21
22        return closestSum;
23    }
24}