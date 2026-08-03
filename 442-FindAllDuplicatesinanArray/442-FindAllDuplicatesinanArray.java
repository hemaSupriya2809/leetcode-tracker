// Last updated: 8/3/2026, 1:53:52 PM
1class Solution {
2    public List<Integer> findDuplicates(int[] nums) {
3        HashSet<Integer> set=new HashSet<>();
4        List<Integer> ans=new ArrayList<>();
5        for(int i=0;i<nums.length;i++){
6            if(set.contains(nums[i])){
7                ans.add(nums[i]);
8            }
9            else{
10                set.add(nums[i]);
11            }
12        }
13        return ans;
14    }
15}