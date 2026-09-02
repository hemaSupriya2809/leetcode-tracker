// Last updated: 9/2/2026, 10:02:05 AM
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                ans.add(nums[i]);
            }
            else{
                set.add(nums[i]);
            }
        }
        return ans;
    }
}