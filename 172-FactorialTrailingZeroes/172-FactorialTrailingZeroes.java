// Last updated: 7/9/2026, 9:19:02 AM
class Solution {
    public int trailingZeroes(int n) {
        int count=0;
        while(n>0){
            n=n/5;
            count=count+n;
        }
        return count;
    }
}