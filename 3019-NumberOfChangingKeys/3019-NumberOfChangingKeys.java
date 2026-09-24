// Last updated: 9/24/2026, 12:26:43 PM
class Solution {
    public int countKeyChanges(String s) {
        char a[]=s.toCharArray();
        int count=0;
        for(int i=1;i<a.length;i++){
            if(a[i]==(char)(a[i-1]+32) || a[i]==(char)(a[i-1]-32) || a[i]==a[i-1]){
                continue;
            }
            else{
                count++;
            }
        }
        return count;
    }
}