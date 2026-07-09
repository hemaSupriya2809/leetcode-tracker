// Last updated: 7/9/2026, 9:18:29 AM
class Solution {
    public void reverseString(char[] s) {
        int j = s.length-1;
        for (int i = 0; i < s.length/2; i++) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            j--;           
        }
        
    }
}