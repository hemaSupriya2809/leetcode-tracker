// Last updated: 9/12/2026, 9:34:52 AM
class Solution {
    public int[] diStringMatch(String s) {
        int h=s.length();
        int l=0;
        int a[]=new int[s.length()+1];
        int e=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                a[e]=l;
                l++;
                e++;
            }
            else if(s.charAt(i)=='D'){
                a[e]=h;
                h--;
                e++;
            }
        }
        a[e]=l;
        return a;
    }
}