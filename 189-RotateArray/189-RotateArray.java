// Last updated: 7/9/2026, 9:18:59 AM
class Solution {
    public void rotate(int[] nums, int k) {
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[(i+k)%nums.length]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=res[i];
        }

    }
}