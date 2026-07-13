// Last updated: 7/13/2026, 11:05:00 AM
1class Solution {
2    public String originalDigits(String s) {
3
4        int[] c = new int[26];
5        for (char ch : s.toCharArray()) {
6            c[ch - 'a']++;
7        }
8
9        int[] d = new int[10];
10
11        d[0] = c['z' - 'a'];
12        d[2] = c['w' - 'a'];
13        d[4] = c['u' - 'a'];
14        d[6] = c['x' - 'a'];
15        d[8] = c['g' - 'a'];
16
17        d[3] = c['h' - 'a'] - d[8];
18        d[5] = c['f' - 'a'] - d[4];
19        d[7] = c['s' - 'a'] - d[6];
20        d[1] = c['o' - 'a'] - d[0] - d[2] - d[4];
21        d[9] = c['i' - 'a'] - d[5] - d[6] - d[8];
22
23        StringBuilder ans = new StringBuilder();
24
25        for (int i = 0; i < 10; i++) {
26            while (d[i]-- > 0) {
27                ans.append(i);
28            }
29        }
30
31        return ans.toString();
32    }
33}