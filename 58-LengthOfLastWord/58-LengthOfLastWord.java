// Last updated: 7/9/2026, 9:19:45 AM
class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
           char ch=s.charAt(i);
           char arr[]=new char[s.length()];
            if(ch==' '&&count==0){
                continue;
            }
           else if(ch!=' '){
            count++;
           }
           else{
            break;
           }
        }
        return count;
    }
}