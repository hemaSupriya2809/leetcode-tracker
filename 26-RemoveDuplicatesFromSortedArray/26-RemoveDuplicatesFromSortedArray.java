// Last updated: 7/9/2026, 9:19:59 AM
class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]!=nums[j]){
                    i++;
                    nums[i]=nums[j];
                }
            }
        return i+1;
    }
}