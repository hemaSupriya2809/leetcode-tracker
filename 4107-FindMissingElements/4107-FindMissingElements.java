// Last updated: 9/2/2026, 9:59:09 AM
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        int max=nums[0];
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]<min){
                min=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i=min;i<=max;i++){
            if(set.contains(i)){
                continue;
            }
            else{
                ans.add(i);
            }
        }
         return ans;
        
    }
}