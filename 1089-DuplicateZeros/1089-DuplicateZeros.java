// Last updated: 8/3/2026, 1:42:38 PM
1class Solution {
2    public void duplicateZeros(int[] arr) {
3        int c=0;
4        for(int i=0;i<arr.length;i++){
5            if(arr[i]==0){
6                c++;
7            }
8        }
9        int a[]=new int[arr.length+c];
10        int ind=0;
11        for(int i=0;i<arr.length;i++){
12            if(arr[i]!=0){
13                a[ind]=arr[i];
14                ind++;
15            }
16            if(arr[i]==0){
17                a[ind]=arr[i];
18                ind++;
19                a[ind]=0;
20                ind++;
21            }
22        }
23       for(int i=0;i<arr.length;i++){
24        arr[i]=a[i];
25       }
26    }
27}