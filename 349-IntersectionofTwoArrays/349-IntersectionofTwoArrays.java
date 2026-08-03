// Last updated: 8/3/2026, 3:06:45 PM
1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        HashSet<Integer> set=new HashSet<>();
4        int a[]=new int[nums2.length];
5        int ind=0;
6        for(int i=0;i<nums1.length;i++){
7            set.add(nums1[i]);
8        }
9        for(int i=0;i<nums2.length;i++){
10            if(set.contains(nums2[i])){
11               a[ind]=nums2[i];
12               ind++;
13               set.remove(nums2[i]);
14            }
15        }
16        int ans[]=new int[ind];
17        for(int i=0;i<ans.length;i++){
18            ans[i]=a[i];
19        }
20        return ans;
21    }
22}