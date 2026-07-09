// Last updated: 7/9/2026, 9:19:22 AM
class Solution {
    public int longestConsecutive(int[] nums) 
    {    
        int n = nums.length;
        if (n == 0)
        return 0;
       Arrays.sort(nums);
        int l = 1; 
        int c = 1;
        for (int i = 1; i < n; i++)
        {
            if (nums[i] != nums[i - 1])
            { 
                if (nums[i] == nums[i - 1] + 1) 
                    c++;
                 else 
                {
                    l = Math.max(l, c);
                    c = 1;
                }
                
            }
        }
        int ans = Math.max(l, c);
        return ans;
    }
}