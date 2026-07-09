// Last updated: 7/9/2026, 9:18:38 AM
class Solution {
    public int missingNumber(int[] nums) {
        LinkedHashSet<Integer> h=new LinkedHashSet<>();
        for(int i:nums){
            h.add(i);
        }
         int s=0;
        for(int i=1;i<=nums.length;i++){
            if(!h.contains(i)){
                 s=i;
            }
        }
        return s;
    }
}