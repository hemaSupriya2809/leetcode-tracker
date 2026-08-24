// Last updated: 8/24/2026, 12:32:04 PM
1class Solution {
2    public int magicalString(int n) {
3        if (n == 0) return 0;
4        if (n <= 3) return 1;
5
6        StringBuilder s = new StringBuilder("122");
7        int p = 2;
8        char last_char = '2';
9
10        while (s.length() < n) {
11            int repeat = s.charAt(p) - '0';
12            char next_char = (last_char == '1') ? '2' : '1';
13
14            for (int i = 0; i < repeat; i++) {
15                s.append(next_char);
16            }
17
18            last_char = next_char;
19            p++;
20        }
21
22        int count = 0;
23        for (int i = 0; i < n; i++) {
24            if (s.charAt(i) == '1') count++;
25        }
26
27        return count;
28    }
29}