// Last updated: 9/12/2026, 9:34:25 AM
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