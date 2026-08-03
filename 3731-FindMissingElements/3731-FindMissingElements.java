// Last updated: 8/3/2026, 2:19:29 PM
1class Solution {
2    public List<Integer> findMissingElements(int[] nums) {
3        List<Integer> ans=new ArrayList<>();
4        HashSet<Integer> set=new HashSet<>();
5        int max=nums[0];
6        int min=nums[0];
7        for(int i=0;i<nums.length;i++){
8            if(nums[i]>max){
9                max=nums[i];
10            }
11            if(nums[i]<min){
12                min=nums[i];
13            }
14        }
15        for(int i=0;i<nums.length;i++){
16            set.add(nums[i]);
17        }
18        for(int i=min;i<=max;i++){
19            if(set.contains(i)){
20                continue;
21            }
22            else{
23                ans.add(i);
24            }
25        }
26         return ans;
27        
28    }
29}