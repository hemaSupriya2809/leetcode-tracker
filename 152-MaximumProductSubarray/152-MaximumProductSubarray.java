// Last updated: 7/9/2026, 9:19:09 AM
class Solution {
    public int maxProduct(int[] nums) {
        int minNegProd = 1;
        int currProd = 1;
        int maxProd = Integer.MIN_VALUE;
        for(int num:nums){
            currProd *= num;
            maxProd = Math.max(maxProd, currProd);
            if(currProd<0){
                if(minNegProd==1){
                    minNegProd = currProd;
                }
                else{
                    maxProd = Math.max(maxProd, currProd/minNegProd);
                }
            }
            else if(currProd==0){
                minNegProd=1;
                currProd=1;
            }
        }
        return maxProd;
    }
}