// Last updated: 7/9/2026, 9:18:39 AM
class Solution {
    public boolean isUgly(int n) {
        for (int i=2; i<6 && n>0; i++)
    while (n % i == 0)
        n /= i;
return n == 1;
    }
}