// Last updated: 8/12/2026, 1:56:00 PM
1class Solution {
2    public String findReplaceString(String s, int[] indices,
3                                    String[] sources, String[] targets) {
4        int n = s.length();
5        int[] a = new int[n];
6        Arrays.fill(a, -1);
7
8        for (int i = 0; i < indices.length; i++)
9            if (s.startsWith(sources[i], indices[i]))
10                a[indices[i]] = i;
11
12        StringBuilder ans = new StringBuilder();
13
14        for (int i = 0; i < n;) {
15            if (a[i] != -1) {
16                int j = a[i];
17                ans.append(targets[j]);
18                i += sources[j].length();
19            } else {
20                ans.append(s.charAt(i++));
21            }
22        }
23
24        return ans.toString();
25    }
26}