// Last updated: 7/14/2026, 11:42:59 AM
1class Solution {
2    public int maximumGap(int[] nums) {
3        int max=0;
4        int sum=0;
5        Arrays.sort(nums);
6        if(nums.length<2){
7            return 0;
8        }
9        for(int i=1;i<nums.length;i++){
10           
11                sum=nums[i]-nums[i-1];
12                if(sum>max){
13                    max=sum;
14                }
15        }
16        return max;
17    }
18}