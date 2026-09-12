// Last updated: 9/12/2026, 9:35:21 AM
class Solution {
    public String toLowerCase(String s) {
        String r="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=65 && s.charAt(i)<=90){
                 r=r+(char)(s.charAt(i)+32);
            }
            else{
                r=r+s.charAt(i);
            }
        }
        return r;
    }
}