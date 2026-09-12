// Last updated: 9/12/2026, 9:34:46 AM
class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String a[]=text.split(" ");
        String b[]=new String[a.length];
        int k=0;
        for(int i=0;i<a.length-2;i++){
            if(a[i].equals(first) && a[i+1].equals(second)){
                b[k]=a[i+2];
                k++; 
            }
        }
        String ans[]=new String[k];
        for(int i=0;i<ans.length;i++){
            ans[i]=b[i];
        }
        return ans;
    }
}