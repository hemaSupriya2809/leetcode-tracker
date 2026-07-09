// Last updated: 7/9/2026, 9:17:47 AM
class Solution {
    public String reverseOnlyLetters(String s) {
        char a[]=s.toCharArray();
        String r="";
        for(int i=0;i<s.length();i++){
             if(Character.isLetter(a[i])){
                r=a[i]+r;
                a[i]='\0';
             }
        }
       
        char b[]=r.toCharArray();
        int h=0;
        for(int i=0;i<a.length;i++){
            if(a[i]=='\0'){
                a[i]=b[h];
                h++;
            }
        }
        String m="";
        for(int i=0;i<a.length;i++){
            m=m+a[i];
        }
        return m;
    }
}