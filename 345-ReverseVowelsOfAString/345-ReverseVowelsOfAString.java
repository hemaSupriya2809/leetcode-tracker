// Last updated: 7/9/2026, 9:18:28 AM
class Solution {
    public String reverseVowels(String s) {
        String r="";
        for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
           if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
               r=ch+r;
           }
        }
        int x=0;
        char l[]=r.toCharArray();
        char k[]=s.toCharArray();
        for(int i=0;i<k.length;i++){
            if(k[i]=='a'||k[i]=='e'||k[i]=='i'||k[i]=='o'||k[i]=='u'||k[i]=='A'||k[i]=='E'||k[i]=='I'||k[i]=='O'||k[i]=='U'){
                k[i]=l[x];
                x++;
            }
        }
        String v="";
        for(int i=0;i<k.length;i++){
            v=v+k[i];
        }
        return v;
    }
}