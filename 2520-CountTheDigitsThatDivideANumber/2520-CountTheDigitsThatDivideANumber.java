// Last updated: 9/12/2026, 9:33:50 AM
class Solution {
    public int countDigits(int num) {
        int count=0;
        int org=num;
        while(num>0){
            int mod=num%10;
            if(org%mod==0){
                count++;
            }
            num=num/10;
        }
        return count;
    }
}