// Last updated: 7/9/2026, 9:18:44 AM
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int a[]=new int[nums.length];
        a[0]=1;
        for(int i=1;i<nums.length;i++){
            a[i]=a[i-1]*nums[i-1];
        
        }
        int r=1;
        for(int i=nums.length-1;i>=0;i--){
            a[i]=a[i]*r;
            r=r*nums[i];
        }
        return a;
    }
}