// Last updated: 7/9/2026, 9:17:24 AM
class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            String r=words[i];
            String s="";
            for(int j=r.length()-1;j>=0;j--){
                s=s+r.charAt(j);
            }
            if(r.equals(s)){
                return r;
            }
        }
        return "";
    }
}