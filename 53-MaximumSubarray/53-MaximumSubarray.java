// Last updated: 7/28/2026, 2:51:24 PM
1class Solution {
2    public int maxSubArray(int[] nums) {
3        
4        int currsum=nums[0];
5        int maxsum=nums[0];
6
7        for(int i=1;i<nums.length;i++){
8           
9            currsum=Math.max(nums[i],(currsum+nums[i]));
10            maxsum=Math.max(currsum,maxsum);
11        }
12        
13        return maxsum;
14    }
15}