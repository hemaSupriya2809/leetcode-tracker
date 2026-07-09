// Last updated: 7/9/2026, 9:19:24 AM
class Solution {
    public boolean isPalindrome(String s) {
        if(s==" "){
            return true;
        }
        String r="";
        for(int i=0;i<s.length();i++){
            char ch=Character.toLowerCase(s.charAt(i));
            if(Character.isLetterOrDigit(ch)){
                r=r+ch;
            }
        }
            String a="";
            for(int i=r.length()-1;i>=0;i--){
                a=a+r.charAt(i);
            }
            
           
                return r.equals(a);
        
    }
}