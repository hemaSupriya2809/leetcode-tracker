// Last updated: 7/9/2026, 9:17:20 AM
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