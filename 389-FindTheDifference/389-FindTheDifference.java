// Last updated: 7/9/2026, 9:18:23 AM
class Solution {
    public char findTheDifference(String s, String t) {
        int sum1=0;
        int sum2=0;
        for(int i=0;i<s.length();i++){
            sum1+=s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            sum2+=t.charAt(i);
        }
        int res=sum2-sum1;
        return (char) res;
    }
}