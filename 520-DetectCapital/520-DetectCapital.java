// Last updated: 7/9/2026, 9:18:07 AM
class Solution {
    public boolean detectCapitalUse(String word) {
        char s[]=word.toCharArray();
        int m=0;
        int n=0;
        int o=0;
        if(s[0]>=65 && s[0]<=90){
                m++;
            }
        for(int i=0;i<s.length;i++){
            
            if(s[i]>=65 && s[i]<=90){
                n++;
            }
            if(s[i]>=97 && s[i]<=122){
                o++;
            }
        }
        if( n==s.length || o==s.length||(m==1 && n==1)){
            return true;
        }
        return false;
    }
}