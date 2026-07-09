// Last updated: 7/9/2026, 9:19:52 AM
class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int lm=0;
        int rm=0;
        int ans=0;
        while(l<r){
            if(height[l]<=height[r]){
                lm=Math.max(lm,height[l]);
                ans+=lm-height[l];
                l++;
            }
            else{
                rm=Math.max(rm,height[r]);
                ans+=rm-height[r];
                r--;
            }
        }
        return ans;
    }
}