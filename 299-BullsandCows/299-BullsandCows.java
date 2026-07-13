// Last updated: 7/13/2026, 11:41:22 AM
1class Solution {
2    public String getHint(String secret, String guess) {
3        char a[]=secret.toCharArray();
4        char b[]=guess.toCharArray();
5        int bull=0;
6        int cow=0;
7        for(int i=0;i<a.length;i++){
8            if(a[i]==b[i]){
9                bull++;
10                a[i]='#';
11                b[i]='$';
12            }
13            
14        }
15        for(int i=0;i<b.length;i++){
16            if(b[i]=='$')
17              continue;
18            for(int j=0;j<a.length;j++){
19                if(b[i]==a[j]){
20                    cow++;
21                    a[j]='#';
22                    break;
23                }
24            }
25        }
26        return bull+"A"+cow+"B";
27    }
28}