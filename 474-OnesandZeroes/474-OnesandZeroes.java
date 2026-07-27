// Last updated: 7/27/2026, 2:02:57 PM
1class Solution {
2    public int findMaxForm(String[] strs, int m, int n) {
3        
4         int[][] dp = new int[m + 1][n + 1];
5
6        for(int i=0;i<strs.length;i++){
7            int z=0;
8            int o=0;
9            for(int j=0;j<strs[i].length();j++){
10                if(strs[i].charAt(j)=='0'){
11                    z++;
12                }
13                else{
14                    o++;
15                }
16            }
17            for (int k = m; k >= z; k--) {
18                for (int l = n; l >= o; l--) {
19                    dp[k][l] = Math.max(dp[k][l], dp[k - z][l - o] + 1);
20                }
21            }
22           
23        }
24        return dp[m][n];
25    }
26}