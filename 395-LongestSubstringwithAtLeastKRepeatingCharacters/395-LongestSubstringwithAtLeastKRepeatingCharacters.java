// Last updated: 8/22/2026, 2:30:59 PM
1class Solution {
2    public int longestSubstring(String s, int k) {
3        int n = s.length();
4        int[] freq = new int[26];
5        for (char ch : s.toCharArray()) {
6            freq[ch - 'a']++;
7        }
8
9        for (int i = 0; i < n; i++) {
10            if (freq[s.charAt(i) - 'a'] < k) {
11                int left = longestSubstring(s.substring(0, i), k);
12                int right = longestSubstring(s.substring(i + 1), k);
13                return Math.max(left, right);
14            }
15        }
16        return n;
17    }
18}