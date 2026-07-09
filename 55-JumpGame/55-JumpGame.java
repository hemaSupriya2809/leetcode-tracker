// Last updated: 7/9/2026, 9:19:46 AM
class Solution {
    public boolean canJump(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(i>count){
                return false;
            }
            count=Math.max(count,i+nums[i]);
        }
            return true;
        
        
    }
}