// Last updated: 9/2/2026, 10:00:27 AM
class Solution {
    public void duplicateZeros(int[] arr) {
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                c++;
            }
        }
        int a[]=new int[arr.length+c];
        int ind=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                a[ind]=arr[i];
                ind++;
            }
            if(arr[i]==0){
                a[ind]=arr[i];
                ind++;
                a[ind]=0;
                ind++;
            }
        }
       for(int i=0;i<arr.length;i++){
        arr[i]=a[i];
       }
    }
}