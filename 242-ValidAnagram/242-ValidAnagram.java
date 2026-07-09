// Last updated: 7/9/2026, 9:18:42 AM
import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;  
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);  
        Arrays.sort(tChars);
        return Arrays.equals(sChars, tChars);
    }
}