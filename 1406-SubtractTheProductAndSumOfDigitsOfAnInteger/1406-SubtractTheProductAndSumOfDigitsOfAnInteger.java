// Last updated: 7/9/2026, 9:17:33 AM
class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int prod=1;
        while(n>0){
            int mod=n%10;
            sum=sum+mod;
            prod=prod*mod;
            n=n/10;
        }
        int d=prod-sum;
        return d;
    }
}