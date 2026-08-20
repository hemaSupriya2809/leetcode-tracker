// Last updated: 8/20/2026, 2:58:07 PM
1class Solution {
2    public String licenseKeyFormatting(String s, int k) {
3        String h="";
4        for(int i=0;i<s.length();i++){
5            if(s.charAt(i)=='-'){
6                continue;
7            }
8            else{
9                h=h+s.charAt(i);
10            }
11        }
12        String g="";
13        int l=0;
14       for(int i=h.length()-1;i>=0;i--){
15            g=h.charAt(i)+g;
16            l++;
17           if(l==k && i!=0){
18             g="-"+g;
19             l=0;
20           }
21       }
22       
23       return g.toUpperCase();
24    }
25}