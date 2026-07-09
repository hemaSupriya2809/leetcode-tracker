// Last updated: 7/9/2026, 9:20:17 AM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int p=m+n;
        int m1=(p-1)/2;
        int m2=p/2;

        int i=0,j=0,count=0;
        int current=0,previous=0;

        while(count<=m2){
            previous=current;
            if(i<m&&(j>=n||nums1[i]<=nums2[j])){
                current=nums1[i++];
            }
            else{
                current=nums2[j++];
            }
            count++;
        }
        if(p%2==0){
            return(previous+current)/2.0;
        }
        else{
            return current;
        }

    }
}