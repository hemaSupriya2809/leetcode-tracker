// Last updated: 7/9/2026, 9:18:47 AM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        else{
            return (n & (n-1))==0;
        }
    }
}