// Last updated: 8/28/2026, 2:38:41 PM
1class Solution {
2    public List<Integer> findAnagrams(String s, String p) {
3        List<Integer> list = new ArrayList<>();
4        if (p.length() > s.length()) {
5            return list;
6        }
7        int[] pFreq = new int[26];
8        int[] windowFreq = new int[26];
9        for (int i = 0; i < p.length(); i++) {
10            pFreq[p.charAt(i) - 'a']++;
11        }
12        int left = 0;
13        for (int right = 0; right < s.length(); right++) {
14            windowFreq[s.charAt(right) - 'a']++;
15            if (right - left + 1 > p.length()) {
16                windowFreq[s.charAt(left) - 'a']--;
17                left++;
18            }
19            if (right - left + 1 == p.length()) {
20                if (isSame(pFreq, windowFreq)) {
21                    list.add(left);
22                }
23            }
24        }
25        return list;
26    }
27    public boolean isSame(int[] a, int[] b) {
28        for (int i = 0; i < 26; i++) {
29            if (a[i] != b[i]) {
30                return false;
31            }
32        }
33        return true;
34    }
35}