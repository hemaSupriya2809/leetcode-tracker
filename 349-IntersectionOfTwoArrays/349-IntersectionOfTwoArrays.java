// Last updated: 9/2/2026, 10:02:58 AM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        int a[]=new int[nums2.length];
        int ind=0;
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
               a[ind]=nums2[i];
               ind++;
               set.remove(nums2[i]);
            }
        }
        int ans[]=new int[ind];
        for(int i=0;i<ans.length;i++){
            ans[i]=a[i];
        }
        return ans;
    }
}