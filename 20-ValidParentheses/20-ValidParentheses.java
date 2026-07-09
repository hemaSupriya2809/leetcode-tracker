// Last updated: 7/9/2026, 9:20:02 AM
class Solution {
    public boolean isValid(String s) {
        char arr[]=new char[s.length()];
        int ind=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                arr[ind++]=')';
            }
            else if(ch=='{'){
                arr[ind++]='}';
            }
            else if(ch=='['){
                arr[ind++]=']';
            }
            else if(ind==0){
                    return false;
            }
            else if(arr[--ind]!=ch){
                return false;
            }
        }
        return ind==0;
    }
}