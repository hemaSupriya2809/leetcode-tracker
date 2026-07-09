// Last updated: 7/9/2026, 9:18:12 AM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int maxCount = 0, count = 0;

        for(int i=0; i<n; i++){
            if(nums[i] == 1){
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }
       return maxCount;
    }
}