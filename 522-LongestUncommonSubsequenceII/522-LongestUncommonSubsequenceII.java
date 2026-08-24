// Last updated: 8/24/2026, 2:12:50 PM
1class Solution {
2    public int findLUSlength(String[] strs) {
3        Arrays.sort(strs, (a, b) -> b.length() - a.length()); // Sort by length descending
4        for (int i = 0; i < strs.length; i++) {
5            boolean isUncommon = true;  
6            for (int j = 0; j < strs.length; j++) {
7                if (i != j && isSubsequence(strs[i], strs[j])) {
8                    isUncommon = false;
9                    break;
10                }
11            }
12            if (isUncommon) {
13                return strs[i].length(); // First longest uncommon string
14            }
15        }
16        return -1;
17    }
18    private static boolean isSubsequence(String a, String b) {
19        int i = 0, j = 0;
20        while (i < a.length() && j < b.length()) {
21            if (a.charAt(i) == b.charAt(j)) {
22                i++;
23            }
24            j++;
25        }
26        return i == a.length();
27    }
28}