// Last updated: 7/9/2026, 9:17:50 AM
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String a[]=s1.split(" ");
        String b[]=s2.split(" ");
        int k=0;
        String x[]=new String[a.length+b.length];
        for(int i=0;i<a.length;i++){
            int count=0;
            for(int j=0;j<a.length;j++){
                if(a[i].equals(a[j])){
                    count++;
                }
            }
            for(int j=0;j<b.length;j++){
                if(a[i].equals(b[j])){
                    count++;
                }
            }

            if(count==1){
               x[k]=a[i];
               k++;
            }
        }
        for(int i=0;i<b.length;i++){
            int count=0;
            for(int j=0;j<b.length;j++){
                if(b[i].equals(b[j])){
                    count++;
                }
            }
            for(int j=0;j<a.length;j++){
                if(b[i].equals(a[j])){
                    count++;
                }
            }

            if(count==1){
               x[k]=b[i];
               k++;
            }
        }
        String ans[]=new String[k];
        for(int i=0;i<ans.length;i++){
            ans[i]=x[i];
        }
        return ans;
    }
}