// Last updated: 9/2/2026, 10:03:14 AM
class Solution {
    public String getHint(String secret, String guess) {
        char a[]=secret.toCharArray();
        char b[]=guess.toCharArray();
        int bull=0;
        int cow=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==b[i]){
                bull++;
                a[i]='#';
                b[i]='$';
            }
            
        }
        for(int i=0;i<b.length;i++){
            if(b[i]=='$')
              continue;
            for(int j=0;j<a.length;j++){
                if(b[i]==a[j]){
                    cow++;
                    a[j]='#';
                    break;
                }
            }
        }
        return bull+"A"+cow+"B";
    }
}